package aux9.part2.solution.items.weapons.melee

abstract class AbstractMelee extends MeleeWeapon{
  val name: String

  def play: Unit = println("Swing " + name)

  def especialAttack: Unit = println("Especial Melee Attack")
}
