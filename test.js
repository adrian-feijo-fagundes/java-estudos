// Função que simula uma tarefa lenta
async function tarefaLenta() {
    console.log("Iniciando tarefa...");
    return new Promise(resolve => setTimeout(() => {
        console.log("Tarefa concluída!");
        resolve("Resultado da tarefa");
    }, 5000));  // Demora 5 segundos
}

// Função que envolve a tarefa com um timeout
async function tarefaComTimeout(timeout) {
    try {
        // Usa Promise.race para definir um limite de tempo para a tarefa
        const resultado = await Promise.race([
            tarefaLenta(),
            new Promise((_, reject) =>
                setTimeout(() => reject(new Error("Timeout")), timeout)
            )
        ]);
        console.log(resultado);
    } catch (error) {
        console.log(error.message);  // Mostra "Timeout" se o tempo limite for excedido
    }
}

// Executa a função com um timeout de 3 segundos
tarefaComTimeout(1000);
