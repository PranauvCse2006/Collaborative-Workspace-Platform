import { NavLink } from "react-router-dom";

function Sidebar() {
    const linkStyle = ({ isActive }) =>
        `block px-3 py-2 rounded-lg text-sm ${
            isActive
                ? "bg-slate-800 text-white"
                : "text-slate-300 hover:bg-slate-800 hover:text-white"
        }`;

    return (
        <div className="w-64 min-h-screen bg-slate-900 p-5 text-white">
            <h1 className="text-xl font-bold">Workspace</h1>
            <p className="text-xs text-slate-400 mt-1">
                Collaborative Platform
            </p>

            <hr className="my-5 border-slate-700" />

            <nav className="space-y-2">
                <NavLink to="/" className={linkStyle}>Dashboard</NavLink>
                <NavLink to="/projects" className={linkStyle}>Projects</NavLink>
                <NavLink to="/tasks" className={linkStyle}>My Tasks</NavLink>
                <NavLink to="/members" className={linkStyle}>Members</NavLink>
            </nav>

            <hr className="my-5 border-slate-700" />

            <NavLink to="/settings" className={linkStyle}>Settings</NavLink>
        </div>
    );
}

export default Sidebar;