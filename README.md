
<body>
    <h1>Parking Lot Management System</h1>
    <p>This is a Spring Boot REST API for managing parking spaces in a parking lot. The API provides CRUD functionality for parking spaces, allowing users to create, retrieve, update, and delete parking spaces.</p>

   <h2>Features</h2>
    <ul>
        <li>Manage parking spaces (add, update, delete)</li>
        <li>Retrieve a list of all parking spaces</li>
        <li>Check the availability of parking spaces</li>
        <li>Built with Spring Boot and H2 in-memory database</li>
    </ul>

  <h2>Technologies Used</h2>
    <ul>
        <li>Java 17</li>
        <li>Spring Boot</li>
        <li>H2 Database</li>
        <li>Maven</li>
    </ul>
    <h2>Getting Started</h2>
    <ol>
        <li>Clone the repository: <code>git clone https://github.com/chisa-sifiso/parking-lot-management.git</code></li>
        <li>Open the project in your favorite IDE (e.g., IntelliJ, Eclipse).</li>
        <li>Run the <code>ParkingApplication</code> class to start the application.</li>
    </ol>

   <h2>Endpoints</h2>
    <p>The following API endpoints are available:</p>
    <table>
        <thead>
            <tr>
                <th>HTTP Method</th>
                <th>Endpoint</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>GET</td>
                <td>/api/parking-spaces</td>
                <td>Retrieve all parking spaces</td>
            </tr>
            <tr>
                <td>GET</td>
                <td>/api/parking-spaces/{id}</td>
                <td>Retrieve a specific parking space by ID</td>
            </tr>
            <tr>
                <td>POST</td>
                <td>/api/parking-spaces</td>
                <td>Add a new parking space</td>
            </tr>
            <tr>
                <td>PUT</td>
                <td>/api/parking-spaces/{id}</td>
                <td>Update an existing parking space</td>
            </tr>
            <tr>
                <td>DELETE</td>
                <td>/api/parking-spaces/{id}</td>
                <td>Delete a parking space by ID</td>
            </tr>
        </tbody>
    </table>

<h2>License</h2>
    <p>This project is licensed under the <a href="https://opensource.org/licenses/MIT">MIT License</a>.</p>
</body>
</html>
