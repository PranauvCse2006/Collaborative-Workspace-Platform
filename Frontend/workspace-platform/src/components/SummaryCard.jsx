function SummaryCard({ title, value }) {
    return (
        <div className="bg-white p-5 rounded-xl border border-slate-200">
            <p className="text-sm text-slate-500">{title}</p>
            <h2 className="text-3xl font-bold text-slate-800 mt-2">
                {value}
            </h2>
        </div>
    );
}

export default SummaryCard;