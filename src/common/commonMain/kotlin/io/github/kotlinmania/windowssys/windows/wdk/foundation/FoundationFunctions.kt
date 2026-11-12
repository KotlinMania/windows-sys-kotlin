package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun ntClose(handle: Handle): Ntstatus

public expect fun ntQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr<CVoid>, objectinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus
