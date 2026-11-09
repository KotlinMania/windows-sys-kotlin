package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun NtClose(handle: HANDLE): NTSTATUS

public expect fun NtQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS
