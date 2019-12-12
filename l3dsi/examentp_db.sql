-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  ven. 14 déc. 2018 à 16:38
-- Version du serveur :  10.1.35-MariaDB
-- Version de PHP :  7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `examentp_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `code` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`code`, `adresse`, `email`, `nom`) VALUES
(1, 'djerba', 'aaa@gmail.com', 'client1');

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE `fournisseur` (
  `reference` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `raisonSocial` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fournisseur`
--

INSERT INTO `fournisseur` (`reference`, `adresse`, `raisonSocial`, `telephone`) VALUES
(1, 'djerba', 'educatif', '123456');

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur_produit`
--

CREATE TABLE `fournisseur_produit` (
  `Fournisseur_reference` int(11) NOT NULL,
  `produits_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fournisseur_produit`
--

INSERT INTO `fournisseur_produit` (`Fournisseur_reference`, `produits_id`) VALUES
(1, 1),
(1, 2),
(1, 3);

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE `produit` (
  `id` int(11) NOT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `prix` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`id`, `designation`, `prix`) VALUES
(1, 'Produit1', 111),
(2, 'Produit2', 222),
(3, 'Produit3', 333);

-- --------------------------------------------------------

--
-- Structure de la table `produit_client`
--

CREATE TABLE `produit_client` (
  `client_id` int(11) NOT NULL,
  `produit_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`code`);

--
-- Index pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  ADD PRIMARY KEY (`reference`);

--
-- Index pour la table `fournisseur_produit`
--
ALTER TABLE `fournisseur_produit`
  ADD UNIQUE KEY `UK_76cdpb3e2bm8qpngubsc47148` (`produits_id`),
  ADD KEY `FKfatgiwuyusj67fd141xi1fvle` (`Fournisseur_reference`);

--
-- Index pour la table `produit`
--
ALTER TABLE `produit`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `produit_client`
--
ALTER TABLE `produit_client`
  ADD KEY `FKolq8w1hhqyd9lttqb9tcy0lbb` (`produit_id`),
  ADD KEY `FK4a9kxfw4toeo9i3hei7vbre0x` (`client_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  MODIFY `reference` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `produit`
--
ALTER TABLE `produit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `fournisseur_produit`
--
ALTER TABLE `fournisseur_produit`
  ADD CONSTRAINT `FKfatgiwuyusj67fd141xi1fvle` FOREIGN KEY (`Fournisseur_reference`) REFERENCES `fournisseur` (`reference`),
  ADD CONSTRAINT `FKhkrpwvld4tlyjngrjv1w11jwe` FOREIGN KEY (`produits_id`) REFERENCES `produit` (`id`);

--
-- Contraintes pour la table `produit_client`
--
ALTER TABLE `produit_client`
  ADD CONSTRAINT `FK4a9kxfw4toeo9i3hei7vbre0x` FOREIGN KEY (`client_id`) REFERENCES `client` (`code`),
  ADD CONSTRAINT `FKolq8w1hhqyd9lttqb9tcy0lbb` FOREIGN KEY (`produit_id`) REFERENCES `produit` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
