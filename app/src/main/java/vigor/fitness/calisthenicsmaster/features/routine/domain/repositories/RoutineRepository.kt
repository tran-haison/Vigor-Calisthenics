package vigor.fitness.calisthenicsmaster.features.routine.domain.repositories

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine

interface RoutineRepository {

    // Routine
    suspend fun insertRoutineList(list: List<Routine>)

    // Progression
    suspend fun insertProgressionList(list: List<Progression>)

    // Plan
    suspend fun insertPlanList(list: List<Plan>)
}