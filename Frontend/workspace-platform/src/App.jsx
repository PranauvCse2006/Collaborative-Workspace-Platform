
import { Routes, Route } from "react-router-dom";

import Sidebar from "./components/Sidebar";
import Dashboard from "./pages/Dashboard";

function App() {
  return (
    <div className="min-h-screen bg-slate-100 flex">
      <Sidebar />

      <main className="flex-1 p-8">
        <Routes>
          <Route path="/" element={<Dashboard />} />
          <Route path="/projects" element={<h1>Projects Page</h1>} />
          <Route path="/tasks" element={<h1>My Tasks Page</h1>} />
          <Route path="/members" element={<h1>Members Page</h1>} />
          <Route path="/settings" element={<h1>Settings Page</h1>} />
        </Routes>
      </main>
    </div>
  );
}

export default App;
