import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanacheDataBaseRepository implements IRechargeDataBaseRepository {
    
    @Override
    public RechargeBO persist(RechargeBO bo) {
        PanacheRecharge entity = PanacheRechargeMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanacheRechargeMapper.toDomain(entity);
    }
}
