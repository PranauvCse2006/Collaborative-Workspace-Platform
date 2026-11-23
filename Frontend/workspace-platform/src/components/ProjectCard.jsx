
function ProjectCard({ title, description, status, progress }) {
    return (
        <div className="bg-white p-5 rounded-xl border border-slate-200">

            <div className="flex justify-between items-center">
                <h2 className="text-lg font-semibold text-slate-800">
                    {title}
                </h2>

                <span className="text-xs bg-blue-100 text-blue-700 px-3 py-1 rounded-full">
                    {status}
                </span>
            </div>

            <p className="text-sm text-slate-500 mt-2">
                {description}
            </p>

            <div className="flex justify-between mt-5 mb-2">
                <span className="text-sm text-slate-500">Progress</span>
                <span className="text-sm font-semibold">{progress}%</span>
            </div>

            <div className="w-full bg-slate-200 rounded-full h-2">
                <div
                    className="bg-blue-600 h-2 rounded-full"
                    style={{ width: `${progress}%` }}
                ></div>
            </div>

        </div>
    );
}

export default ProjectCard;
