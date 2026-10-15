// port-lint: source Windows/Win32/System/Time/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.cinterop.windows_sys_system_time_to_file_time
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer

public fun SystemTimeToFileTime(
    lpsystemtime: Long,
    lpfiletime: Long,
): BOOL =
    windows_sys_system_time_to_file_time(
        lpsystemtime.toCPointer(),
        lpfiletime.toCPointer(),
    )

public fun SystemTimeToFileTime(
    lpsystemtime: SYSTEMTIME,
    lpfiletime: FILETIME,
): BOOL =
    memScoped {
        val st = alloc<platform.windows.SYSTEMTIME>()
        st.wYear = lpsystemtime.wYear
        st.wMonth = lpsystemtime.wMonth
        st.wDayOfWeek = lpsystemtime.wDayOfWeek
        st.wDay = lpsystemtime.wDay
        st.wHour = lpsystemtime.wHour
        st.wMinute = lpsystemtime.wMinute
        st.wSecond = lpsystemtime.wSecond
        st.wMilliseconds = lpsystemtime.wMilliseconds
        val ft = alloc<platform.windows.FILETIME>()
        val res = windows_sys_system_time_to_file_time(st.ptr, ft.ptr)
        if (res != 0) {
            lpfiletime.dwLowDateTime = ft.dwLowDateTime
            lpfiletime.dwHighDateTime = ft.dwHighDateTime
        }
        res
    }
