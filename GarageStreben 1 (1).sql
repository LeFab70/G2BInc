DROP DATABASE GarageSteben;
CREATE DATABASE IF NOT EXISTS GarageSteben;
USE GarageSteben;

-- Table Vehicule
CREATE TABLE Vehicule (
    id INT PRIMARY KEY AUTO_INCREMENT,
    marque VARCHAR(50) NOT NULL,
    modele VARCHAR(50) NOT NULL,
    no_plaque VARCHAR(20),
    couleur ENUM ('Rouge', 'Bleu', 'Vert', 'Noir', 'Blanc', 'Gris', 'Autre'),
    kilometrage DOUBLE,
    no_serie INT NOT NULL,
    annee INT
);

-- Table unique pour tous les types d'employés
CREATE TABLE Employe (
    id INT PRIMARY KEY AUTO_INCREMENT,
    type_employe ENUM('Mecanicien', 'Debosseleur', 'Conseiller') NOT NULL,
    prenom VARCHAR(50),
    nom VARCHAR(50),
    courriel VARCHAR(100),
    no_telephone VARCHAR(20),
    date_naissance DATE,
    statut ENUM('Actif', 'Inactif'),
    certifications VARCHAR(100),           -- Pour Mecanicien
    specialisations VARCHAR(100),          -- Pour Debosseleur
    langues_parlees ENUM ('Français', 'Anglais', 'Espagnol', 'Mandarin', 'Arabe', 'Portugais', 'Russe', 'Autre'),          -- Pour Conseiller
    objectif_vente DOUBLE,         -- Pour Conseiller
    commission DOUBLE              -- Pour Conseiller
);

-- Table des tâches
CREATE TABLE Tache (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100) NOT NULL,
    description TEXT,
    prix DOUBLE,
    estTerminee BOOLEAN
);

-- Table de liaison entre employé et tâche
CREATE TABLE ExecuterTache (
    id INT PRIMARY KEY AUTO_INCREMENT,
    date DATE,
    status ENUM('Créée', 'En attente', 'En cours', 'Complétée'),
    nb_heures DOUBLE,
    id_employe INT NOT NULL,
    id_tache INT NOT NULL,
    id_vehicule INT NOT NULL,
    FOREIGN KEY (id_vehicule) REFERENCES Vehicule(id),
    FOREIGN KEY (id_employe) REFERENCES Employe(id),
    FOREIGN KEY (id_tache) REFERENCES Tache(id)
);

INSERT INTO Vehicule (marque, modele, no_plaque, couleur, kilometrage, no_serie, annee) VALUES
('Toyota', 'Corolla', 'YZX123', 'Blanc', 132500.5, 100001, 2015),
('Honda', 'Civic', 'ABC456', 'Noir', 98000.0, 100002, 2017),
('Ford', 'F-150', 'TRK789', 'Gris', 160300.2, 100003, 2014),
('Chevrolet', 'Equinox', 'EQX321', 'Rouge', 112450.9, 100004, 2016),
('Nissan', 'Sentra', 'NIS555', 'Bleu', 87500.0, 100005, 2019),
('Hyundai', 'Elantra', 'HYU777', 'Vert', 70500.3, 100006, 2020),
('Mazda', 'CX-5', 'MAZ888', 'Noir', 64200.7, 100007, 2021),
('Volkswagen', 'Jetta', 'VWJ999', 'Gris', 145600.1, 100008, 2013),
('Subaru', 'Outback', 'SUB222', 'Blanc', 123450.0, 100009, 2018),
('Kia', 'Sorento', 'KIA111', 'Autre', 99500.4, 100010, 2016);

INSERT INTO Tache (nom, description, prix, estTerminee) VALUES
('Changement d’huile', 'Vidange et remplacement du filtre à huile.', 59.99, FALSE),
('Alignement', 'Réglage de la géométrie des roues.', 89.99, TRUE),
('Réparation portière', 'Débosselage et peinture portière droite.', 350.00, FALSE),
('Inspection', 'Inspection complète du véhicule.', 99.99, TRUE),
('Changement de freins', 'Remplacement des plaquettes de freins avant et arrière.', 249.99, FALSE),
('Révision moteur', 'Contrôle et remplacement des pièces usées du moteur.', 499.99, FALSE),
('Changement de batterie', 'Remplacement de la batterie du véhicule.', 120.00, TRUE),
('Réparation échappement', 'Réparation ou remplacement du système d’échappement.', 300.00, FALSE),
('Nettoyage intérieur', 'Aspiration et nettoyage complet de l’intérieur du véhicule.', 79.99, TRUE),
('Réparation suspension', 'Remplacement ou réparation des amortisseurs et ressorts.', 450.00, FALSE),
('Révision système de climatisation', 'Contrôle et recharge du système de climatisation.', 130.00, TRUE),
('Réparation phare', 'Remplacement d’un phare avant ou arrière endommagé.', 150.00, FALSE);


INSERT INTO Employe (type_employe, prenom, nom, courriel, no_telephone, date_naissance, statut, certifications, specialisations, langues_parlees, objectif_vente, commission)
VALUES 
('Mecanicien', 'Jean', 'Dupont', 'jean.dupont@email.com', '514-123-4567', '1985-03-12', 'Actif', 'Certifié mécanique automobile', NULL, NULL, NULL, NULL),
('Mecanicien', 'Pierre', 'Lemoine', 'pierre.lemoine@email.com', '514-234-5678', '1990-11-20', 'Actif', 'Certifié mécanique moteur', NULL, NULL, NULL, NULL),
('Mecanicien', 'Marc', 'Rousseau', 'marc.rousseau@email.com', '514-345-6789', '1982-07-15', 'Inactif', 'Certifié mécanique poids lourds', NULL, NULL, NULL, NULL),
('Debosseleur', 'Sophie', 'Gauthier', 'sophie.gauthier@email.com', '418-123-4567', '1992-05-22', 'Actif', NULL, 'Débosseleur carrosserie', NULL, NULL, NULL),
('Debosseleur', 'David', 'Moreau', 'david.moreau@email.com', '418-234-5678', '1988-01-30', 'Actif', NULL, 'Réparations carrosserie haut de gamme', NULL, NULL, NULL),
('Debosseleur', 'Lucie', 'Bouchard', 'lucie.bouchard@email.com', '418-345-6789', '1984-10-03', 'Inactif', NULL, 'Réparations carrosserie automobile', NULL, NULL, NULL),
('Conseiller', 'Alice', 'Tremblay', 'alice.tremblay@email.com', '450-123-4567', '1995-02-14', 'Actif', NULL, NULL, 'Français, Anglais', 150000.00, 10000.00),
('Conseiller', 'Julien', 'Fortin', 'julien.fortin@email.com', '450-234-5678', '1990-09-10', 'Actif', NULL, NULL, 'Français, Espagnol', 200000.00, 12000.00),
('Conseiller', 'Claire', 'Lemoine', 'claire.lemoine@email.com', '450-345-6789', '1987-04-18', 'Inactif', NULL, NULL, 'Français, Anglais, Portugais', 100000.00, 8000.00);

INSERT INTO ExecuterTache (date, status, nb_heures, id_vehicule, id_employe, id_tache)
VALUES
('2025-04-01', 'Complétée', 8.5, 1, 1, 1),
('2025-04-02', 'En cours', 7.0, 2, 2, 2),
('2025-04-02', 'En attente', 5.0, 3, 3, 3),
('2025-04-03', 'Créée', 6.5, 4, 4, 4),
('2025-04-03', 'Complétée', 4.0, 5, 5, 5),
('2025-04-04', 'En cours', 9.0, 6, 6, 6),
('2025-04-04', 'Complétée', 7.5, 7, 7, 7),
('2025-04-05', 'En attente', 8.0, 8, 8, 8),
('2025-04-06', 'Complétée', 6.0, 9, 9, 9);
