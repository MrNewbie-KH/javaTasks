let randomize_array = document.getElementById("randomize_array_btn");
let sort_btn = document.getElementById("sort_btn");
let bars_container = document.getElementById("bars_container");
let mini = 1;
let maxi = 20;
let barNumber = 20;
let unsortedArray = new Array(barNumber);

// GETTING A RANDOM NUMBER BETWEEN MINI AND MAXI
function getRandomNumber(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}

// FILLING TTHE ARRAY WITH RANDOM NUMBERS
function createRandomArray() {
  for (let i = 0; i < barNumber; i++) {
    unsortedArray[i] = getRandomNumber(mini, maxi);
    // console.log(typeof unsortedArray[0]);
  }
}

document.addEventListener("DOMContentLoaded", function () {
  createRandomArray();
  renderBars(unsortedArray);
});

function renderBars(array) {
  for (let i = 0; i < array.length; i++) {
    let bar = document.createElement("div");
    bar.classList.add("bar");
    bar.style.height = array[i] * 10 + "px";
    bars_container.appendChild(bar);
  }
}
randomize_array.addEventListener("click", function () {
  createRandomArray();
  bars_container.innerHTML = "";
  renderBars(unsortedArray);
});

// Sleep function
function sleep(ms) {
  return new Promise((resolve, reject) => {
    setTimeout(resolve, ms);
  });
}
let bars = document.getElementsByClassName("bar");
async function quickSort(start, end, arr) {
  // base case
  let i = start;
  let j = end;
  let pivot = i;
  if (start >= end) {
    return;
  }
  // transition
  while (i < j) {
    // bars[pivot].style.height = arr[pivot] * 10 + "px";
    // bars[pivot].style.backgroundColor = "blue";
    if (pivot == i) {
      if (arr[pivot] > arr[j]) {
        let temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        //
        bars[i].style.height = arr[i] * 10 + "px";
        // bars[i].style.backgroundColor = "yellow";
        await sleep(100);

        // bars[i].innerText = arr[i];
        pivot = j;
        ++i;
      } else j--;
    } else if (pivot == j) {
      if (arr[pivot] < arr[i]) {
        let temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        //
        bars[j].style.height = arr[j] * 10 + "px";
        // bars[j].style.backgroundColor = "yellow";
        await sleep(100);

        pivot = i;
        --j;
      } else i++;
    }
    //
    bars[pivot].style.height = arr[pivot] * 10 + "px";
    bars[pivot].style.backgroundColor = "blue";
    await sleep(100);
  }
  // bars[pivot].style.backgroundColor = "#cb6434";

  await sleep(100);
  quickSort(start, pivot - 1, unsortedArray);
  quickSort(pivot + 1, end, unsortedArray);
}
sort_btn.addEventListener("click", function () {
  quickSort(0, barNumber - 1, unsortedArray);
});
