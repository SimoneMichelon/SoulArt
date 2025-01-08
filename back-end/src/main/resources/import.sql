-- Categories
INSERT INTO category (category_id, category_name) VALUES (1, 'Openness');
INSERT INTO category (category_id, category_name) VALUES (2, 'Conscientiousness');
INSERT INTO category (category_id, category_name) VALUES (3, 'Extraversion');
INSERT INTO category (category_id, category_name) VALUES (4, 'Agreeableness');
INSERT INTO category (category_id, category_name) VALUES (5, 'Neuroticism');

-- Questions
INSERT INTO question (id, question_body, question_category_id) VALUES (1, 'Mi piace esplorare idee nuove e creative.', 1);
INSERT INTO question (id, question_body, question_category_id) VALUES (2, 'Trovo stimolante visitare posti nuovi o leggere libri che aprono la mente.', 1);
INSERT INTO question (id, question_body, question_category_id) VALUES (3, 'Sono curioso/a riguardo argomenti di cui non so nulla.', 1);

INSERT INTO question (id, question_body, question_category_id) VALUES (4, 'Pianifico attentamente le attività prima di iniziare.', 2);
INSERT INTO question (id, question_body, question_category_id) VALUES (5, 'Mi impegno a completare ciò che inizio, anche se richiede sforzo.', 2);
INSERT INTO question (id, question_body, question_category_id) VALUES (6, 'Organizzo bene il mio tempo per rispettare le scadenze.', 2);

INSERT INTO question (id, question_body, question_category_id) VALUES (7, 'Mi sento energico/a quando sono in mezzo alla gente.', 3);
INSERT INTO question (id, question_body, question_category_id) VALUES (8, 'Mi piace iniziare conversazioni con persone nuove.', 3);
INSERT INTO question (id, question_body, question_category_id) VALUES (9, 'Trovo facile esprimermi in contesti sociali.', 3);

INSERT INTO question (id, question_body, question_category_id) VALUES (10, 'Cerco di aiutare gli altri quando posso.', 4);
INSERT INTO question (id, question_body, question_category_id) VALUES (11, 'Mi piace collaborare e lavorare in team per raggiungere obiettivi comuni.', 4);
INSERT INTO question (id, question_body, question_category_id) VALUES (12, 'Sono attento/a ai bisogni delle persone che mi circondano.', 4);

INSERT INTO question (id, question_body, question_category_id) VALUES (13, 'Riesco a mantenere la calma anche in situazioni stressanti.', 5);
INSERT INTO question (id, question_body, question_category_id) VALUES (14, 'Non mi lascio sopraffare facilmente dalle emozioni negative.', 5);
INSERT INTO question (id, question_body, question_category_id) VALUES (15, 'Mi sento a mio agio nell''affrontare sfide o incertezze.', 5);