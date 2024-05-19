package pnj.uts.ti.sep_sarip_hidayattuloh

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {

    private lateinit var tvEmail: TextView
    private lateinit var tvnim: TextView
    private lateinit var tvNama: TextView
    private lateinit var tvKelas: TextView
    private lateinit var btnLogout: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Initialize views
        tvEmail = view.findViewById(R.id.tvEmail)
        tvnim = view.findViewById(R.id.tvnim)
        tvNama = view.findViewById(R.id.tvnama)
        tvKelas = view.findViewById(R.id.tvkelas)
        btnLogout = view.findViewById(R.id.btnlogout)

        // Set user profile data
        val save = requireContext().getSharedPreferences("profile", Context.MODE_PRIVATE)
        val email = save.getString("email", "N/A")
        val nim = save.getString("nim", "N/A")
        val nama = save.getString("nama", "N/A")
        val kelas = save.getString("kelas", "N/A")

        tvEmail.text = email
        tvnim.text = nim
        tvNama.text = nama
        tvKelas.text = kelas

        // Logout button click listener
        btnLogout.setOnClickListener {
            // Implement logout functionality here
            // For example, clearing SharedPreferences and navigating to login screen
            save.edit().clear().apply()

            val intent = Intent(requireContext(), loginform::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            requireActivity().finish()
        }
        return view
    }
}