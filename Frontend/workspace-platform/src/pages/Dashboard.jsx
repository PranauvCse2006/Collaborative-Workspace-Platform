
import SummaryCard from "../components/SummaryCard";
import ProjectCard from "../components/ProjectCard";
import TaskItem from "../components/TaskItem";
function Dashboard() {
    const summaryData = [
        { title: "Total Projects", value: 4 },
        { title: "Total Tasks", value: 12 },
        { title: "Members", value: 8 },
        { title: "Pending Tasks", value: 3 },
        { title: "Active Projects", value: 6 }
    ];

    const projects = [
        {
            title: "College Event Management",
            description: "Plan and coordinate college events with your team.",
            status: "Active",
            progress: 65
        },
        {
            title: "Website Redesign",
            description: "Collaborate on redesigning a company website.",
            status: "In Progress",
            progress: 40
        },
        {
            title: "Research Collaboration",
            description: "Organize research activities and documentation.",
            status: "Completed",
            progress: 100
        }
    ];
    const tasks = [
        {
            title: "Design event registration page",
            project: "College Event Management",
            status: "In Progress"
        },
        {
            title: "Create homepage layout",
            project: "Website Redesign",
            status: "Pending"
        },
        {
            title: "Prepare research documentation",
            project: "Research Collaboration",
            status: "Completed"
        }
    ];

    return (
        <div className="space-y-8">

            {/* Page Header */}
            <div>
                <h1 className="text-3xl font-bold text-slate-800">
                    Dashboard Overview
                </h1>

                <p className="text-slate-500 mt-2">
                    Welcome back! Here's what's happening in your workspace.
                </p>
            </div>

            {/* Summary Cards */}
            <div className="grid grid-cols-2 lg:grid-cols-4 gap-5">
                {summaryData.map((item, index) => (
                    <SummaryCard
                        key={index}
                        title={item.title}
                        value={item.value}
                    />
                ))}
            </div>
            {/* Recent Projects */}
            <section>
                <h2 className="text-xl font-bold text-slate-800 mb-5">
                    Recent Projects
                </h2>

                <div className="grid grid-cols-1 md:grid-cols-2 xl:grid-cols-3 gap-5">
                    {projects.map((project, index) => (
                        <ProjectCard
                            key={index}
                            title={project.title}
                            description={project.description}
                            status={project.status}
                            progress={project.progress}
                        />
                    ))}
                </div>
            </section>
            {/* My Tasks */}
            <section>
                <h2 className="text-xl font-bold text-slate-800 mb-5">
                    My Tasks
                </h2>

                <div className="flex flex-col gap-3">
                    {tasks.map((task, index) => (
                        <TaskItem
                            key={index}
                            title={task.title}
                            project={task.project}
                            status={task.status}
                        />
                    ))}
                </div>
            </section>

        </div>
    );
}

export default Dashboard;
