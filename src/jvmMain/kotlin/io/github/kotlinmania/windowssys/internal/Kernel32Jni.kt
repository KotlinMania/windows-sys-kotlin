package io.github.kotlinmania.windowssys.internal

internal object Kernel32Jni {
    init {
        try {
            System.loadLibrary("windows_sys_jni")
        } catch (_: UnsatisfiedLinkError) {
            // Native library not in java.library.path
        }
    }

    @JvmStatic
    external fun CloseHandle(hObject: Long): Int

    @JvmStatic
    external fun GetLastError(): Int

    @JvmStatic
    external fun LocalFree(hMem: Long): Long

    @JvmStatic
    external fun SetHandleInformation(hObject: Long, dwMask: Int, dwFlags: Int): Int

    @JvmStatic
    external fun DuplicateHandle(
        hSourceProcessHandle: Long,
        hSourceHandle: Long,
        hTargetProcessHandle: Long,
        lpTargetHandle: LongArray,
        dwDesiredAccess: Int,
        bInheritHandle: Int,
        dwOptions: Int,
    ): Int

    @JvmStatic
    external fun SetFileAttributesW(lpFileName: Long, dwFileAttributes: Int): Int
}
