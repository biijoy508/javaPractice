- Excel exporter kan exportera en excel fil från en javascript array. 
   Titta på BudgetTransaktionerController och budget-transaktioner.html för ett komplett exempel på hur du använder den här komponenten.

- Lägg till följande rad i din frontend-html-fil 
   
      <div excel-export load-excel-data="loadExcelData()" 
      export-data="exportData"file-name="{{fileName}}"></div>
    
- Backend-kontrollern ska se ut som kodblocket nedan och dessutom kan du lägga till egna anpassningar till den
 
      $scope.fileName = 'BudgetTransaktioner'; // Namn på excel fil som kommer att skapas
      $scope.exportData = []; // Tom array
      $scope.budgetTransaktionerList = FYLLA PÅ MED DATA SOM KOMMER ATT EXPORTERAS.
      $scope.excelKolumnTemplate = [{
           wch: 16.5 // Skapad Datum
       }, {
            wch: 12 // Status
        }, {
            wch: 18 // Organisation
        }]; // Definerar alla kolumn width, valfri

      $scope.loadExcelData = function () {

      $scope.exportData.length = 0;

      $scope.exportData.push(['Skapad Datum', 'Status', 'Organisation']);  // Header för excel table

      angular.forEach($scope.budgetTransaktionerList, function (value, key) {
        $scope.exportData.push([value.skapadDatum, value.statusTyp, value.organisationNamn]); 
      }); // Fylla på excel fil med data från budgetTransaktionerList / eller vilken list som helst
    }; 
