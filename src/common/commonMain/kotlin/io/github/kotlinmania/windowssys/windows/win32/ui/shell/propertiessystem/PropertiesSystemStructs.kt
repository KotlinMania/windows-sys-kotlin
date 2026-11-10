package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

public data class Propprg(
    public var flPrg: UShort = 0u,
    public var flPrgInit: UShort = 0u,
    public var achTitle: ByteArray = ByteArray(30),
    public var achCmdLine: ByteArray = ByteArray(128),
    public var achWorkDir: ByteArray = ByteArray(64),
    public var wHotKey: UShort = 0u,
    public var achIconFile: ByteArray = ByteArray(80),
    public var wIconIndex: UShort = 0u,
    public var dwEnhModeFlags: UInt = 0u,
    public var dwRealModeFlags: UInt = 0u,
    public var achOtherFile: ByteArray = ByteArray(80),
    public var achPIFFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propprg) return false
        if (this.flPrg != other.flPrg) return false
        if (this.flPrgInit != other.flPrgInit) return false
        if (!this.achTitle.contentEquals(other.achTitle)) return false
        if (!this.achCmdLine.contentEquals(other.achCmdLine)) return false
        if (!this.achWorkDir.contentEquals(other.achWorkDir)) return false
        if (this.wHotKey != other.wHotKey) return false
        if (!this.achIconFile.contentEquals(other.achIconFile)) return false
        if (this.wIconIndex != other.wIconIndex) return false
        if (this.dwEnhModeFlags != other.dwEnhModeFlags) return false
        if (this.dwRealModeFlags != other.dwRealModeFlags) return false
        if (!this.achOtherFile.contentEquals(other.achOtherFile)) return false
        if (!this.achPIFFile.contentEquals(other.achPIFFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flPrg.hashCode()
        result = 31 * result + this.flPrgInit.hashCode()
        result = 31 * result + this.achTitle.contentHashCode()
        result = 31 * result + this.achCmdLine.contentHashCode()
        result = 31 * result + this.achWorkDir.contentHashCode()
        result = 31 * result + this.wHotKey.hashCode()
        result = 31 * result + this.achIconFile.contentHashCode()
        result = 31 * result + this.wIconIndex.hashCode()
        result = 31 * result + this.dwEnhModeFlags.hashCode()
        result = 31 * result + this.dwRealModeFlags.hashCode()
        result = 31 * result + this.achOtherFile.contentHashCode()
        result = 31 * result + this.achPIFFile.contentHashCode()
        return result
    }
}
