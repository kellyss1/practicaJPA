-- Insertar proveedores
INSERT INTO suppliers (name, country, contact) VALUES ('Proveedor A', 'Ecuador', 'contacto@proveedora.com');
INSERT INTO suppliers (name, country, contact) VALUES ('Proveedor B', 'Colombia', 'contacto@proveedorb.com');

-- Insertar categorías
INSERT INTO categories (name, description) VALUES ('Electrónica', 'Productos electrónicos como teléfonos, computadoras, etc.');
INSERT INTO categories (name, description) VALUES ('Ropa', 'Prendas de vestir para hombres, mujeres y niños');

-- Insertar productos
INSERT INTO products (name, description, price, quantity, category_id, supplier_id) VALUES ('Smartphone X', 'Smartphone de última generación', 599.99, 100, 1, 1);
INSERT INTO products (name, description, price, quantity, category_id, supplier_id) VALUES ('Laptop Y', 'Laptop con procesador i7', 999.99, 50, 1, 1);
INSERT INTO products (name, description, price, quantity, category_id, supplier_id) VALUES ('Camisa Elegante', 'Camisa de algodón para hombres', 29.99, 200, 2, 2);
INSERT INTO products (name, description, price, quantity, category_id, supplier_id) VALUES ('Pantalón Casual', 'Pantalón de mezclilla para hombres', 39.99, 150, 2, 2);
