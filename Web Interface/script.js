var principal = 0;
var interestRate = 0;
var termOfLoan = 0;
var amount = 0;
var repo = 0;

//Create function for calculations based on Agreement Type

function calculatePercentage() {
    event.preventDefault();
    var repo = parseFloat(document.getElementById("repoRate").value);

    var type1 = document.getElementById("mortageAgrements");
    var type2 = document.getElementById("creditFacilities");
    var type3 = document.getElementById("unsecuredCredit");
    var type4 = document.getElementById("smallBusiness");
    var type5 = document.getElementById("lowHousing");
    var type6 = document.getElementById("shortTerm");
    var type7 = document.getElementById("otherCredit");
    var type8 = document.getElementById("incidentalCredit");

    //Used IF & ELSEIF statements to check the radio button, then do the calculation based on the selection

    if (type1.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 5/100;

    elseif (type2.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 10/100;

    elseif (type3.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 20/100;

    elseif (type4.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 20/100;

    elseif (type5.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 20/100;
        
    elseif (type6.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 20/100;

    elseif (type7.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 10/100;

    elseif (type8.checked == true)
        repo = repo.getElementById("repoRate").value
        interestRate = (repo * 2.2) + 20/100;
}

document.getElementById("percentage").innerHTML = interestRate;

//Create function for calculations of Interest based on the percentage

function compoundInterest() {
  event.preventDefault();
  var principal = parseFloat(document.getElementById("startAmount").value);
  var interestRate = parseFloat(document.getElementById("percentage").value);
  interestRate = interestRate / 100;
  var termOfLoan = parseFloat(document.getElementById("termCompound").value);

//Tried to seperate the equation by using different variables

  var a = principal * (interestRate/100);
  var b = termOfLoan * 365;
  var amount = (a * b).toFixed(2);
  document.getElementById("output1").innerHTML = "Interest: R" + (amount - principal).toFixed(2);
  document.getElementById("output2").innerHTML = "Total plus interest: R" + amount.toFixed(2);
}