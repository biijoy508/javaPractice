- index.html-filen innehåller redan pulf-loadspinner tagg, Så vi behöver inte inkludera taggen
    i någon annan html-fil.
    
- Kopiera och klistra in NotificationService.wait method före $promise anropet. 

    NotificationService.wait($scope.resource.$promise, 'Laddar data...');
    $scope.resource.$promise.then(function (response) {});
