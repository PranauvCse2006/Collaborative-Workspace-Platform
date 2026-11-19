
function Sidebar() {
  return (
    <aside className="w-64 min-h-screen bg-slate-900 text-white p-6">

      <h1 className="text-2xl font-bold">
        Workspace
      </h1>

      <p className="text-sm text-slate-400 mt-1">
        Collaborative Platform
      </p>

      <hr className="my-6 border-slate-700" />

      <nav className="flex flex-col gap-4">

        <a href="#" className="hover:text-blue-400">
          Dashboard
        </a>

        <a href="#" className="hover:text-blue-400">
          Projects
        </a>

        <a href="#" className="hover:text-blue-400">
          My Tasks
        </a>

        <a href="#" className="hover:text-blue-400">
          Members
        </a>

      </nav>

      <hr className="my-6 border-slate-700" />

      <a href="#" className="hover:text-blue-400">
        Settings
      </a>

    </aside>
  );
}

export default Sidebar;
