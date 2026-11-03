package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun interface FnCallback {
    public operator fun invoke(callbackcontext: Long)
}

public fun OOBEComplete(isoobecomplete: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "OOBEComplete", longArrayOf(isoobecomplete)).toInt()
}

public fun RegisterWaitUntilOOBECompleted(oobecompletedcallback: OOBE_COMPLETED_CALLBACK, callbackcontext: Long, waithandle: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RegisterWaitUntilOOBECompleted", longArrayOf(Win32DynamicFfi.objectSlot(oobecompletedcallback), callbackcontext, waithandle)).toInt()
}

public fun UnregisterWaitUntilOOBECompleted(waithandle: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterWaitUntilOOBECompleted", longArrayOf(waithandle)).toInt()
}
