-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 04 déc. 2019 à 20:43
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `tp1-bda-ticit`
--

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `afficher_nom_ville_dept`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `afficher_nom_ville_dept` (IN `numDept` INT)  NO SQL
BEGIN
select NomD, Ville
FROM departement WHERE NumDep=numDept;
END$$

DROP PROCEDURE IF EXISTS `insert_dept_records`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_dept_records` (IN `num_dept` INT, IN `nom_dept` VARCHAR(50), IN `ville` VARCHAR(50), IN `num_emp_dir` INT)  NO SQL
BEGIN
INSERT INTO departement VALUES(num_dept,nom_dept,ville,num_emp_dir);
END$$

--
-- Fonctions
--
DROP FUNCTION IF EXISTS `number_records_employé`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `number_records_employé` () RETURNS INT(11) NO SQL
BEGIN
DECLARE nb integer;
SELECT COUNT(*) INTO nb
FROM employe;
RETURN nb;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

DROP TABLE IF EXISTS `departement`;
CREATE TABLE IF NOT EXISTS `departement` (
  `NumDep` int(11) NOT NULL AUTO_INCREMENT,
  `NomD` varchar(64) DEFAULT NULL,
  `Ville` varchar(64) DEFAULT NULL,
  `Dir` int(11) DEFAULT NULL,
  PRIMARY KEY (`NumDep`),
  UNIQUE KEY `NomD` (`NomD`),
  KEY `ce_dep` (`Dir`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `departement`
--

INSERT INTO `departement` (`NumDep`, `NomD`, `Ville`, `Dir`) VALUES
(1, 'marketing', 'Houmt souk', 30),
(2, 'Production', 'Midoun', 10),
(3, 'Développement', 'Ajim', 40),
(9, 'dept', 'djerba', 20);

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE IF NOT EXISTS `employe` (
  `NumEmp` int(11) NOT NULL,
  `NomE` varchar(64) DEFAULT NULL,
  `Prof` varchar(200) DEFAULT NULL,
  `DateEmb` date DEFAULT NULL,
  `Sal` double DEFAULT NULL,
  `Comm` double DEFAULT NULL,
  `dept` int(11) NOT NULL,
  PRIMARY KEY (`NumEmp`),
  KEY `ce_emp` (`dept`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `employe`
--

INSERT INTO `employe` (`NumEmp`, `NomE`, `Prof`, `DateEmb`, `Sal`, `Comm`, `dept`) VALUES
(10, 'ali', 'Ingénieur', '2000-10-01', 900, 30, 3),
(60, 'wijdene', 'developpeur', '1997-01-01', 0, 0, 1),
(30, 'amel', 'Vendeur', '2000-01-01', 550, 10, 1),
(40, 'lotfi', 'Ingenieur', '1999-09-01', 1000, 20, 3),
(50, 'foulen', 'Technicien', '2005-05-21', 400, 10, 3);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prenom` varchar(60) NOT NULL,
  `nom` varchar(64) DEFAULT NULL,
  `adresse` varchar(60) NOT NULL,
  `date_de_naissance` date NOT NULL,
  `carte_identite` int(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`id`, `prenom`, `nom`, `adresse`, `date_de_naissance`, `carte_identite`) VALUES
(1, 'ahmed', 'Benahmed', 'Djerba Tunisie', '2011-09-22', 12345678),
(2, 'salah', 'Ben salah', 'Djerba Tunisie', '1990-12-01', 11223344);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `sumsal`
-- (Voir ci-dessous la vue réelle)
--
DROP VIEW IF EXISTS `sumsal`;
CREATE TABLE IF NOT EXISTS `sumsal` (
`prof` varchar(200)
,`salM` double
);

-- --------------------------------------------------------

--
-- Structure de la vue `sumsal`
--
DROP TABLE IF EXISTS `sumsal`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sumsal`  AS  select `employe`.`Prof` AS `prof`,avg(`employe`.`Sal`) AS `salM` from `employe` group by `employe`.`Prof` ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
