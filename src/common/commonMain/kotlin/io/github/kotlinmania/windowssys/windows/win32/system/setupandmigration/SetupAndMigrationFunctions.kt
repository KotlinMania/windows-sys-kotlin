package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun OOBEComplete(isoobecomplete: Long): BOOL

public expect fun RegisterWaitUntilOOBECompleted(oobecompletedcallback: OOBE_COMPLETED_CALLBACK, callbackcontext: Long, waithandle: Long): BOOL

public expect fun UnregisterWaitUntilOOBECompleted(waithandle: Long): BOOL
