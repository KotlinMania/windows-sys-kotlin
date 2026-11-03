package io.github.kotlinmania.windowssys.windows.win32.system.registry

public typealias HKEY = Long

public fun interface PQUERYHANDLERFn {
    public operator fun invoke(keycontext: Long, val_list: Long, num_vals: UInt, outputbuffer: Long, total_outlen: Long, input_blen: UInt): UInt
}

public typealias PQUERYHANDLER = PQUERYHANDLERFn?

public typealias REG_CREATE_KEY_DISPOSITION = UInt

public typealias REG_NOTIFY_FILTER = UInt

public typealias REG_OPEN_CREATE_OPTIONS = UInt

public typealias REG_RESTORE_KEY_FLAGS = Int

public typealias REG_ROUTINE_FLAGS = UInt

public typealias REG_SAM_FLAGS = UInt

public typealias REG_SAVE_FORMAT = UInt

public typealias REG_VALUE_TYPE = UInt
