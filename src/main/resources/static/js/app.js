function eliminarFuncionario(id) {
    if (confirm("¿Estás seguro de que deseas eliminar este funcionario?")) {
        fetch(`/eliminar/${id}`, {
            method: 'DELETE',
        }).then(response => {
            if (response.ok) {
                location.reload();
            }
        });
    }
}

function actualizarFuncionario(id) {
    const nombre = document.getElementById('nombre').value;
    const cargo = document.getElementById('cargo').value;
    const departamento = document.getElementById('departamento').value;

    fetch(`/actualizar/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            id: id,
            nombre: nombre,
            cargo: cargo,
            departamento: departamento
        }),
    }).then(response => {
        if (response.ok) {
            location.reload();
        }
    });
}