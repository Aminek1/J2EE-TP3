**<h3>Compte rendu<h3>

<h4>- On creer 3 packages entities et repository et web</h4>
<img src="Captures/Packages.png" alt="">

<h4>- Dans entities on creer l'entite jpa Patient </h4>
<img src="Captures/Patient.png" alt="">

<h4>- Grace à Lombok, on peut utiliser l'annotation @Data pour avoir
les getters et les setters ainsi que la methode Tostring, on peut aussi utiliser @NoArgsConstructor pour
le constructeur sans parametre et @AllArgsConstructor pour le constructeur avec parametre</h4>

<h4>- Dans repository on creer l'interface PatientRepository</h4>
<img src="Captures/PatientRepo.png" alt="">

<h4>- Dans HopitalTP3Application, on implemente linterface CommandeLineRunner pour executer un traitement au demarage, on fait appele
a PatientRepository et on fait l'injection des dependences en utilisant @Autowired et on declare 3 patients :</h4>
<img src="Captures/APP.png" alt="">

<h4>- Dans la couche Web On creer un controlleur , on fait appelle a PatientRepository, on fait l'injection des dependences en utilisant le constructeur avec parametre apres on retourne une view Patient, et grace à @GetMapping("/index") si on tape localhost:8084/index ca va nous retourner une view patients.html</h4>
<img src="Captures/PatientC.png" alt="">

<h4>Dans la vue patients.html on creer une page Html en utilisant bootstrap :</h4>
<img src="Captures/Html1.png" alt="">
<img src="Captures/Html2.png" alt="">

<h4>La page retourner apres avoir taper localhost:8084/index :</h4>
<img src="Captures/Execution.png" alt="">
<h4>--------concernant la 2eme partie-------------</h4>
<h4>On veut afficher une NavBar avec un DropDown et On a cree une template en utilisant Boostrap :
</h4>
<img src="Captures/temp1.png" alt="">
<img src="Captures/temp11.png" alt="">
<img src="Captures/execution1.png" alt="">
<h4>Apres on veut ajouter des patients </h4>
<img src="Captures/formPat.png" alt="">
<img src="Captures/formPat2.png" alt="">
<img src="Captures/execution2.png" alt="">
<h4>Et on veut modifier les Informations du patient </h4>
<img src="Captures/edit1.png" alt="">
<img src="Captures/editExe.png" alt="">













