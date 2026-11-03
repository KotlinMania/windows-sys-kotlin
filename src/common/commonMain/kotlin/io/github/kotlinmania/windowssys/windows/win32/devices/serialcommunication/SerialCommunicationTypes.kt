package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

public typealias HCOMDB = Long

public fun interface PSERENUM_READPORTFn {
    public operator fun invoke(serportaddress: Long): UByte
}

public typealias PSERENUM_READPORT = PSERENUM_READPORTFn?

public fun interface PSERENUM_WRITEPORTFn {
    public operator fun invoke(serportaddress: Long, value: UByte)
}

public typealias PSERENUM_WRITEPORT = PSERENUM_WRITEPORTFn?

public typealias SERENUM_PORTION = Int
