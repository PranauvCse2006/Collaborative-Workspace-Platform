function TaskItem({ title, project, status }) {
    const statusStyles = {
        "Pending": "bg-yellow-100 text-yellow-700",
        "In Progress": "bg-blue-100 text-blue-700",
        "Completed": "bg-green-100 text-green-700"
    };
    return (
        <div className="flex items-center justify-between bg-white p-4 rounded-lg border border-slate-200">

            <div>
                <h3 className="font-medium text-slate-800">
                    {title}
                </h3>

                <p className="text-sm text-slate-500 mt-1">
                    {project}
                </p>
            </div>

            <span className={`text-xs px-3 py-1 rounded-full ${statusStyles[status]}`}>
                {status}
            </span>

        </div>
    );
}

export default TaskItem;