package vigor.fitness.calisthenicsmaster.features.skill.domain.models


import com.google.gson.annotations.SerializedName

data class Plan(
    @SerializedName("nr")
    val nr: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("set")
    val `set`: Int,
    @SerializedName("beat")
    val beat: Int,
    @SerializedName("exerciseState")
    val exerciseState: ExerciseState,
    @SerializedName("pauseAfterSet")
    val pauseAfterSet: Int,
    @SerializedName("pauseAfterExercise")
    val pauseAfterExercise: Int,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("dynamic")
    val `dynamic`: Boolean? = null,
)