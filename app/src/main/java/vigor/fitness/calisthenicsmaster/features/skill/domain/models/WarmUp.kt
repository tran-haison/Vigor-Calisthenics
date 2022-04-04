package vigor.fitness.calisthenicsmaster.features.skill.domain.models


import com.google.gson.annotations.SerializedName

data class WarmUp(
    @SerializedName("name")
    val name: String,
    @SerializedName("beat")
    val beat: Int
)