@Override
public void dispose() {
	this.isOpen = false;
	this.id = 0;
	this.packets.reset(); // Calls dispose on each packet
	CSPManager.resourcePool.putConnection(this);
}