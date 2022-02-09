INSERT INTO users(username, password, name, role) VALUES ('josgongar12', 'gonzalezgarcia', 'Jose Carlos', 'Estudiante');
INSERT INTO users(username, password, name, role) VALUES ('marrodoso', 'rodriguezosorio', 'Marcos', 'Estudiante');
INSERT INTO users(username, password, name, role) VALUES ('japarejo', 'joseantonio', 'Jose Antonio', 'Profesor');

INSERT INTO analysis(id, types, name, details) VALUES (1, 'Central Tendency', 'Mean', 'This is a mean description');
INSERT INTO analysis(id, types, name, details) VALUES (2, 'Central Tendency', 'Median', 'This is a median description');
INSERT INTO analysis(id, types, name, details) VALUES (3, 'Central Tendency', 'Moda', 'This is a moda description');
INSERT INTO analysis(id, types, name, details) VALUES (4, 'Dispersion', 'StandarDev', 'This is a standard deviation description');
INSERT INTO analysis(id, types, name, details) VALUES (5, 'Dispersion', 'Variance', 'This is a variance description');
INSERT INTO analysis(id, types, name, details) VALUES (6, 'Dispersion', 'Range', 'This is a range description');
INSERT INTO analysis(id, types, name, details) VALUES (7, 'Dispersion', 'IRQ', 'This is a IRQ description');
INSERT INTO analysis(id, types, name, details) VALUES (8, 'Correlation', 'Pearson', 'This is a Pearson description');
INSERT INTO analysis(id, types, name, details) VALUES (9, 'Correlation', 'Spearman', 'This is a Spearman description');
INSERT INTO analysis(id, types, name, details) VALUES (10, 'Correlation', 'Kendall', 'This is a Kendall description');
INSERT INTO analysis(id, types, name, details) VALUES (11, 'NHST', 'TStudent', 'This is a T Student description');
INSERT INTO analysis(id, types, name, details) VALUES (12, 'NHST', 'Shapiro-Wilk', 'This is a Shapiro-Wilk description');


INSERT INTO data(id, by2, having2) VALUES (1, 'Lista de variables', 'Where');

INSERT INTO of2(id, variable, data_id) VALUES (1, 'Lista de variables', 1);
INSERT INTO of2(id, variable, data_id) VALUES (2, 'Esto es una prueba para ver si va bien', 1);

INSERT INTO datasourcespec(id, url) VALUES (1, 'as.com');
INSERT INTO datasourcespec(id, url) VALUES (2, 'nicolas.com');

INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (1, 1, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (2, 2, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (3, 3, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (4, 4, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (5, 5, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (6, 6, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (7, 7, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (8, 8, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (9, 9, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (10, 10, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (11, 11, 1, 1);
INSERT INTO spec(id, analysis_id, data_id,url_id) VALUES (12, 12, 1, 1);


