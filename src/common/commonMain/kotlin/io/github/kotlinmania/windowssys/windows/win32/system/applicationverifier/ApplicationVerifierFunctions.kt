package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun verifierEnumerateResource(process: Handle, flags: VerifierEnumResourceFlags, resourcetype: UInt, resourcecallback: AvrfResourceEnumerateCallback, enumerationcontext: MutPtr): UInt
