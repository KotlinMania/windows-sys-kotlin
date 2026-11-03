#include <jni.h>
#include <stdint.h>

#ifdef _WIN32
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <oleauto.h>

typedef BOOL (WINAPI *PFN_CompareObjectHandles)(HANDLE, HANDLE);
static BOOL SafeCompareObjectHandles(HANDLE h1, HANDLE h2) {
    static PFN_CompareObjectHandles pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("kernelbase.dll");
        if (!hModule) hModule = GetModuleHandleA("kernel32.dll");
        if (hModule) {
            pfn = (PFN_CompareObjectHandles)(void(*)(void))GetProcAddress(hModule, "CompareObjectHandles");
        }
        initialized = 1;
    }
    if (pfn) {
        return pfn(h1, h2);
    }
    return (h1 == h2) ? TRUE : FALSE;
}

typedef ULONG (NTAPI *PFN_RtlNtStatusToDosError)(LONG);
static ULONG SafeRtlNtStatusToDosError(LONG status) {
    static PFN_RtlNtStatusToDosError pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("ntdll.dll");
        if (hModule) {
            pfn = (PFN_RtlNtStatusToDosError)(void(*)(void))GetProcAddress(hModule, "RtlNtStatusToDosError");
        }
        initialized = 1;
    }
    if (pfn) {
        return pfn(status);
    }
    return 0;
}

typedef void (WINAPI *PFN_SetLastErrorEx)(DWORD, DWORD);
static void SafeSetLastErrorEx(DWORD dwErrCode, DWORD dwType) {
    static PFN_SetLastErrorEx pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("user32.dll");
        if (!hModule) hModule = LoadLibraryA("user32.dll");
        if (hModule) {
            pfn = (PFN_SetLastErrorEx)(void(*)(void))GetProcAddress(hModule, "SetLastErrorEx");
        }
        initialized = 1;
    }
    if (pfn) {
        pfn(dwErrCode, dwType);
    } else {
        SetLastError(dwErrCode);
    }
}

typedef BOOL (WINAPI *PFN_K32EmptyWorkingSet)(HANDLE);
static BOOL SafeK32EmptyWorkingSet(HANDLE hProcess) {
    static PFN_K32EmptyWorkingSet pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("kernel32.dll");
        if (hModule) {
            pfn = (PFN_K32EmptyWorkingSet)(void(*)(void))GetProcAddress(hModule, "K32EmptyWorkingSet");
        }
        if (!pfn) {
            HMODULE hPsapi = LoadLibraryA("psapi.dll");
            if (hPsapi) {
                pfn = (PFN_K32EmptyWorkingSet)(void(*)(void))GetProcAddress(hPsapi, "EmptyWorkingSet");
            }
        }
        initialized = 1;
    }
    if (pfn) {
        return pfn(hProcess);
    }
    return FALSE;
}

typedef BOOL (WINAPI *PFN_LockWorkStation)(void);
static BOOL SafeLockWorkStation(void) {
    static PFN_LockWorkStation pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("user32.dll");
        if (!hModule) hModule = LoadLibraryA("user32.dll");
        if (hModule) {
            pfn = (PFN_LockWorkStation)(void(*)(void))GetProcAddress(hModule, "LockWorkStation");
        }
        initialized = 1;
    }
    if (pfn) {
        return pfn();
    }
    return FALSE;
}

typedef HRESULT (WINAPI *PFN_SHGetKnownFolderPath)(const GUID*, DWORD, HANDLE, PWSTR*);
static HRESULT SafeSHGetKnownFolderPath(const GUID *rfid, DWORD dwFlags, HANDLE hToken, PWSTR *ppszPath) {
    static PFN_SHGetKnownFolderPath pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("shell32.dll");
        if (!hModule) hModule = LoadLibraryA("shell32.dll");
        if (hModule) {
            pfn = (PFN_SHGetKnownFolderPath)(void(*)(void))GetProcAddress(hModule, "SHGetKnownFolderPath");
        }
        initialized = 1;
    }
    if (pfn) {
        return pfn(rfid, dwFlags, hToken, ppszPath);
    }
    return (HRESULT)0x80004001; /* E_NOTIMPL */
}

typedef void (WINAPI *PFN_CoTaskMemFree)(LPVOID);
static void SafeCoTaskMemFree(LPVOID pv) {
    static PFN_CoTaskMemFree pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("ole32.dll");
        if (!hModule) hModule = LoadLibraryA("ole32.dll");
        if (hModule) {
            pfn = (PFN_CoTaskMemFree)(void(*)(void))GetProcAddress(hModule, "CoTaskMemFree");
        }
        initialized = 1;
    }
    if (pfn) {
        pfn(pv);
    }
}

typedef BOOL (WINAPI *PFN_GetUserPreferredUILanguages)(DWORD, PULONG, LPWSTR, PULONG);
static BOOL SafeGetUserPreferredUILanguages(DWORD dwFlags, PULONG pulNumLanguages, LPWSTR pwszLanguagesBuffer, PULONG pcchLanguagesBuffer) {
    static PFN_GetUserPreferredUILanguages pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("kernel32.dll");
        if (hModule) {
            pfn = (PFN_GetUserPreferredUILanguages)(void(*)(void))GetProcAddress(hModule, "GetUserPreferredUILanguages");
        }
        initialized = 1;
    }
    if (pfn) {
        return pfn(dwFlags, pulNumLanguages, pwszLanguagesBuffer, pcchLanguagesBuffer);
    }
    return FALSE;
}

typedef BOOL (WINAPI *PFN_GetTimeZoneInformationForYear)(USHORT, PVOID, LPTIME_ZONE_INFORMATION);
static BOOL SafeGetTimeZoneInformationForYear(USHORT wYear, PVOID pdtzi, LPTIME_ZONE_INFORMATION ptzi) {
    static PFN_GetTimeZoneInformationForYear pfn = NULL;
    static int initialized = 0;
    if (!initialized) {
        HMODULE hModule = GetModuleHandleA("kernel32.dll");
        if (hModule) {
            pfn = (PFN_GetTimeZoneInformationForYear)(void(*)(void))GetProcAddress(hModule, "GetTimeZoneInformationForYear");
        }
        initialized = 1;
    }
    if (pfn) {
        return pfn(wYear, pdtzi, ptzi);
    }
    return FALSE;
}
#endif


#ifdef __cplusplus
extern "C" {
#endif

/* --- Foundation Functions --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_CloseHandle
  (JNIEnv *env, jclass cls, jlong hObject) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)CloseHandle((HANDLE)(intptr_t)hObject);
#else
    (void)hObject;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetLastError
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)GetLastError();
#else
    return 0;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetLastError
  (JNIEnv *env, jclass cls, jint dwErrCode) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    SetLastError((DWORD)dwErrCode);
#else
    (void)dwErrCode;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetLastErrorEx
  (JNIEnv *env, jclass cls, jint dwErrCode, jint dwType) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    SafeSetLastErrorEx((DWORD)dwErrCode, (DWORD)dwType);
#else
    (void)dwErrCode;
    (void)dwType;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_LocalFree
  (JNIEnv *env, jclass cls, jlong hMem) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)LocalFree((HLOCAL)(intptr_t)hMem);
#else
    (void)hMem;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetHandleInformation
  (JNIEnv *env, jclass cls, jlong hObject, jint dwMask, jint dwFlags) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SetHandleInformation((HANDLE)(intptr_t)hObject, (DWORD)dwMask, (DWORD)dwFlags);
#else
    (void)hObject;
    (void)dwMask;
    (void)dwFlags;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetHandleInformation
  (JNIEnv *env, jclass cls, jlong hObject, jintArray lpdwFlags) {
    (void)cls;
#ifdef _WIN32
    DWORD flags = 0;
    BOOL res = GetHandleInformation((HANDLE)(intptr_t)hObject, &flags);
    if (res && lpdwFlags != NULL) {
        jint val = (jint)flags;
        (*env)->SetIntArrayRegion(env, lpdwFlags, 0, 1, &val);
    }
    return (jint)res;
#else
    (void)env;
    (void)hObject;
    (void)lpdwFlags;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_DuplicateHandle
  (JNIEnv *env, jclass cls, jlong hSourceProcessHandle, jlong hSourceHandle, jlong hTargetProcessHandle,
   jlongArray lpTargetHandle, jint dwDesiredAccess, jint bInheritHandle, jint dwOptions) {
    (void)cls;
#ifdef _WIN32
    HANDLE targetHandle = NULL;
    BOOL res = DuplicateHandle(
        (HANDLE)(intptr_t)hSourceProcessHandle,
        (HANDLE)(intptr_t)hSourceHandle,
        (HANDLE)(intptr_t)hTargetProcessHandle,
        &targetHandle,
        (DWORD)dwDesiredAccess,
        (BOOL)bInheritHandle,
        (DWORD)dwOptions
    );
    if (res && lpTargetHandle != NULL) {
        jlong val = (jlong)(intptr_t)targetHandle;
        (*env)->SetLongArrayRegion(env, lpTargetHandle, 0, 1, &val);
    }
    return (jint)res;
#else
    (void)env;
    (void)hSourceProcessHandle;
    (void)hSourceHandle;
    (void)hTargetProcessHandle;
    (void)lpTargetHandle;
    (void)dwDesiredAccess;
    (void)bInheritHandle;
    (void)dwOptions;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_CompareObjectHandles
  (JNIEnv *env, jclass cls, jlong hFirstObjectHandle, jlong hSecondObjectHandle) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SafeCompareObjectHandles((HANDLE)(intptr_t)hFirstObjectHandle, (HANDLE)(intptr_t)hSecondObjectHandle);
#else
    (void)hFirstObjectHandle;
    (void)hSecondObjectHandle;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_FreeLibrary
  (JNIEnv *env, jclass cls, jlong hLibModule) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)FreeLibrary((HMODULE)(intptr_t)hLibModule);
#else
    (void)hLibModule;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GlobalFree
  (JNIEnv *env, jclass cls, jlong hMem) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GlobalFree((HGLOBAL)(intptr_t)hMem);
#else
    (void)hMem;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_RtlNtStatusToDosError
  (JNIEnv *env, jclass cls, jint status) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SafeRtlNtStatusToDosError((LONG)status);
#else
    (void)status;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysAllocString
  (JNIEnv *env, jclass cls, jlong psz) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)SysAllocString((const OLECHAR*)(intptr_t)psz);
#else
    (void)psz;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysAllocStringByteLen
  (JNIEnv *env, jclass cls, jlong psz, jint len) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)SysAllocStringByteLen((LPCSTR)(intptr_t)psz, (UINT)len);
#else
    (void)psz;
    (void)len;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysAllocStringLen
  (JNIEnv *env, jclass cls, jlong strIn, jint ui) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)SysAllocStringLen((const OLECHAR*)(intptr_t)strIn, (UINT)ui);
#else
    (void)strIn;
    (void)ui;
    return 0;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysFreeString
  (JNIEnv *env, jclass cls, jlong bstrString) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    SysFreeString((BSTR)(intptr_t)bstrString);
#else
    (void)bstrString;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysReAllocString
  (JNIEnv *env, jclass cls, jlongArray pbstr, jlong psz) {
    (void)cls;
#ifdef _WIN32
    if (pbstr == NULL) return 0;
    jlong currentVal = 0;
    (*env)->GetLongArrayRegion(env, pbstr, 0, 1, &currentVal);
    BSTR bstr = (BSTR)(intptr_t)currentVal;
    int res = SysReAllocString(&bstr, (const OLECHAR*)(intptr_t)psz);
    jlong newVal = (jlong)(intptr_t)bstr;
    (*env)->SetLongArrayRegion(env, pbstr, 0, 1, &newVal);
    return res;
#else
    (void)env;
    (void)pbstr;
    (void)psz;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysReAllocStringLen
  (JNIEnv *env, jclass cls, jlongArray pbstr, jlong psz, jint len) {
    (void)cls;
#ifdef _WIN32
    if (pbstr == NULL) return 0;
    jlong currentVal = 0;
    (*env)->GetLongArrayRegion(env, pbstr, 0, 1, &currentVal);
    BSTR bstr = (BSTR)(intptr_t)currentVal;
    int res = SysReAllocStringLen(&bstr, (const OLECHAR*)(intptr_t)psz, (UINT)len);
    jlong newVal = (jlong)(intptr_t)bstr;
    (*env)->SetLongArrayRegion(env, pbstr, 0, 1, &newVal);
    return res;
#else
    (void)env;
    (void)pbstr;
    (void)psz;
    (void)len;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysAddRefString
  (JNIEnv *env, jclass cls, jlong bstrString) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SysAddRefString((BSTR)(intptr_t)bstrString);
#else
    (void)bstrString;
    return 0;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysReleaseString
  (JNIEnv *env, jclass cls, jlong bstrString) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    SysReleaseString((BSTR)(intptr_t)bstrString);
#else
    (void)bstrString;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysStringByteLen
  (JNIEnv *env, jclass cls, jlong bstr) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SysStringByteLen((BSTR)(intptr_t)bstr);
#else
    (void)bstr;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SysStringLen
  (JNIEnv *env, jclass cls, jlong pbstr) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SysStringLen((BSTR)(intptr_t)pbstr);
#else
    (void)pbstr;
    return 0;
#endif
}

/* --- Storage / FileSystem Functions --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetFileAttributesW
  (JNIEnv *env, jclass cls, jlong lpFileName, jint dwFileAttributes) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SetFileAttributesW((LPCWSTR)(intptr_t)lpFileName, (DWORD)dwFileAttributes);
#else
    (void)lpFileName;
    (void)dwFileAttributes;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetFileAttributesA
  (JNIEnv *env, jclass cls, jlong lpFileName, jint dwFileAttributes) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SetFileAttributesA((LPCSTR)(intptr_t)lpFileName, (DWORD)dwFileAttributes);
#else
    (void)lpFileName;
    (void)dwFileAttributes;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFileAttributesW
  (JNIEnv *env, jclass cls, jlong lpFileName) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)GetFileAttributesW((LPCWSTR)(intptr_t)lpFileName);
#else
    (void)lpFileName;
    return -1;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFileAttributesA
  (JNIEnv *env, jclass cls, jlong lpFileName) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)GetFileAttributesA((LPCSTR)(intptr_t)lpFileName);
#else
    (void)lpFileName;
    return -1;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_CreateFileW
  (JNIEnv *env, jclass cls, jlong lpFileName, jint dwDesiredAccess, jint dwShareMode,
   jlong lpSecurityAttributes, jint dwCreationDisposition, jint dwFlagsAndAttributes, jlong hTemplateFile) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)CreateFileW(
        (LPCWSTR)(intptr_t)lpFileName,
        (DWORD)dwDesiredAccess,
        (DWORD)dwShareMode,
        (LPSECURITY_ATTRIBUTES)(intptr_t)lpSecurityAttributes,
        (DWORD)dwCreationDisposition,
        (DWORD)dwFlagsAndAttributes,
        (HANDLE)(intptr_t)hTemplateFile
    );
#else
    (void)lpFileName;
    (void)dwDesiredAccess;
    (void)dwShareMode;
    (void)lpSecurityAttributes;
    (void)dwCreationDisposition;
    (void)dwFlagsAndAttributes;
    (void)hTemplateFile;
    return -1;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_CreateFileA
  (JNIEnv *env, jclass cls, jlong lpFileName, jint dwDesiredAccess, jint dwShareMode,
   jlong lpSecurityAttributes, jint dwCreationDisposition, jint dwFlagsAndAttributes, jlong hTemplateFile) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)CreateFileA(
        (LPCSTR)(intptr_t)lpFileName,
        (DWORD)dwDesiredAccess,
        (DWORD)dwShareMode,
        (LPSECURITY_ATTRIBUTES)(intptr_t)lpSecurityAttributes,
        (DWORD)dwCreationDisposition,
        (DWORD)dwFlagsAndAttributes,
        (HANDLE)(intptr_t)hTemplateFile
    );
#else
    (void)lpFileName;
    (void)dwDesiredAccess;
    (void)dwShareMode;
    (void)lpSecurityAttributes;
    (void)dwCreationDisposition;
    (void)dwFlagsAndAttributes;
    (void)hTemplateFile;
    return -1;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_DeleteFileW
  (JNIEnv *env, jclass cls, jlong lpFileName) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)DeleteFileW((LPCWSTR)(intptr_t)lpFileName);
#else
    (void)lpFileName;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_DeleteFileA
  (JNIEnv *env, jclass cls, jlong lpFileName) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)DeleteFileA((LPCSTR)(intptr_t)lpFileName);
#else
    (void)lpFileName;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_FlushFileBuffers
  (JNIEnv *env, jclass cls, jlong hFile) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)FlushFileBuffers((HANDLE)(intptr_t)hFile);
#else
    (void)hFile;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_AreFileApisANSI
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)AreFileApisANSI();
#else
    return 1;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFileSize
  (JNIEnv *env, jclass cls, jlong hFile, jintArray lpFileSizeHigh) {
    (void)cls;
#ifdef _WIN32
    DWORD high = 0;
    DWORD res = GetFileSize((HANDLE)(intptr_t)hFile, lpFileSizeHigh != NULL ? &high : NULL);
    if (lpFileSizeHigh != NULL) {
        jint val = (jint)high;
        (*env)->SetIntArrayRegion(env, lpFileSizeHigh, 0, 1, &val);
    }
    return (jint)res;
#else
    (void)env;
    (void)hFile;
    (void)lpFileSizeHigh;
    return -1;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetFilePointer
  (JNIEnv *env, jclass cls, jlong hFile, jint lDistanceToMove, jintArray lpDistanceToMoveHigh, jint dwMoveMethod) {
    (void)cls;
#ifdef _WIN32
    LONG high = 0;
    if (lpDistanceToMoveHigh != NULL) {
        jint inHigh = 0;
        (*env)->GetIntArrayRegion(env, lpDistanceToMoveHigh, 0, 1, &inHigh);
        high = (LONG)inHigh;
    }
    DWORD res = SetFilePointer(
        (HANDLE)(intptr_t)hFile,
        (LONG)lDistanceToMove,
        lpDistanceToMoveHigh != NULL ? &high : NULL,
        (DWORD)dwMoveMethod
    );
    if (lpDistanceToMoveHigh != NULL) {
        jint outHigh = (jint)high;
        (*env)->SetIntArrayRegion(env, lpDistanceToMoveHigh, 0, 1, &outHigh);
    }
    return (jint)res;
#else
    (void)env;
    (void)hFile;
    (void)lDistanceToMove;
    (void)lpDistanceToMoveHigh;
    (void)dwMoveMethod;
    return -1;
#endif
}

/* --- System / Threading Functions --- */

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCurrentProcess
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetCurrentProcess();
#else
    return -1;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCurrentProcessId
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)GetCurrentProcessId();
#else
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCurrentThread
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetCurrentThread();
#else
    return -2;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCurrentThreadId
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)GetCurrentThreadId();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_TerminateProcess
  (JNIEnv *env, jclass cls, jlong hProcess, jint uExitCode) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)TerminateProcess((HANDLE)(intptr_t)hProcess, (UINT)uExitCode);
#else
    (void)hProcess;
    (void)uExitCode;
    return 0;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_ExitProcess
  (JNIEnv *env, jclass cls, jint uExitCode) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    ExitProcess((UINT)uExitCode);
#else
    (void)uExitCode;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_OpenProcess
  (JNIEnv *env, jclass cls, jint dwDesiredAccess, jint bInheritHandle, jint dwProcessId) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)OpenProcess((DWORD)dwDesiredAccess, (BOOL)bInheritHandle, (DWORD)dwProcessId);
#else
    (void)dwDesiredAccess;
    (void)bInheritHandle;
    (void)dwProcessId;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_K32EmptyWorkingSet
  (JNIEnv *env, jclass cls, jlong hProcess) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SafeK32EmptyWorkingSet((HANDLE)(intptr_t)hProcess);
#else
    (void)hProcess;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetTimeZoneInformation
  (JNIEnv *env, jclass cls, jlong lpTimeZoneInformation) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpTimeZoneInformation) {
        SetLastError(87);
        return (jint)0xFFFFFFFF;
    }
    return (jint)GetTimeZoneInformation((LPTIME_ZONE_INFORMATION)(intptr_t)lpTimeZoneInformation);
#else
    (void)lpTimeZoneInformation;
    return (jint)0xFFFFFFFF;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetTimeZoneInformationStruct
  (JNIEnv *env, jclass cls, jintArray outInts, jshortArray outStandardName, jshortArray outDaylightName) {
    (void)cls;
#ifdef _WIN32
    TIME_ZONE_INFORMATION tzi;
    ZeroMemory(&tzi, sizeof(tzi));
    DWORD res = GetTimeZoneInformation(&tzi);
    if (outInts != NULL) {
        jint vals[19];
        vals[0] = (jint)tzi.Bias;
        vals[1] = (jint)tzi.StandardDate.wYear;
        vals[2] = (jint)tzi.StandardDate.wMonth;
        vals[3] = (jint)tzi.StandardDate.wDayOfWeek;
        vals[4] = (jint)tzi.StandardDate.wDay;
        vals[5] = (jint)tzi.StandardDate.wHour;
        vals[6] = (jint)tzi.StandardDate.wMinute;
        vals[7] = (jint)tzi.StandardDate.wSecond;
        vals[8] = (jint)tzi.StandardDate.wMilliseconds;
        vals[9] = (jint)tzi.StandardBias;
        vals[10] = (jint)tzi.DaylightDate.wYear;
        vals[11] = (jint)tzi.DaylightDate.wMonth;
        vals[12] = (jint)tzi.DaylightDate.wDayOfWeek;
        vals[13] = (jint)tzi.DaylightDate.wDay;
        vals[14] = (jint)tzi.DaylightDate.wHour;
        vals[15] = (jint)tzi.DaylightDate.wMinute;
        vals[16] = (jint)tzi.DaylightDate.wSecond;
        vals[17] = (jint)tzi.DaylightDate.wMilliseconds;
        vals[18] = (jint)tzi.DaylightBias;
        (*env)->SetIntArrayRegion(env, outInts, 0, 19, vals);
    }
    if (outStandardName != NULL) {
        (*env)->SetShortArrayRegion(env, outStandardName, 0, 32, (const jshort*)tzi.StandardName);
    }
    if (outDaylightName != NULL) {
        (*env)->SetShortArrayRegion(env, outDaylightName, 0, 32, (const jshort*)tzi.DaylightName);
    }
    return (jint)res;
#else
    (void)env;
    (void)outInts;
    (void)outStandardName;
    (void)outDaylightName;
    return (jint)0xFFFFFFFF;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetTimeZoneInformationForYear
  (JNIEnv *env, jclass cls, jint wYear, jlong pdtzi, jlong ptzi) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!ptzi) {
        SetLastError(87);
        return 0;
    }
    return (jint)SafeGetTimeZoneInformationForYear(
        (USHORT)wYear,
        (PVOID)(intptr_t)pdtzi,
        (LPTIME_ZONE_INFORMATION)(intptr_t)ptzi
    );
#else
    (void)wYear;
    (void)pdtzi;
    (void)ptzi;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetTimeZoneInformationForYearStruct
  (JNIEnv *env, jclass cls, jint wYear, jintArray outInts, jshortArray outStandardName, jshortArray outDaylightName) {
    (void)cls;
#ifdef _WIN32
    TIME_ZONE_INFORMATION tzi;
    ZeroMemory(&tzi, sizeof(tzi));
    BOOL res = SafeGetTimeZoneInformationForYear((USHORT)wYear, NULL, &tzi);
    if (res) {
        if (outInts != NULL) {
            jint vals[19];
            vals[0] = (jint)tzi.Bias;
            vals[1] = (jint)tzi.StandardDate.wYear;
            vals[2] = (jint)tzi.StandardDate.wMonth;
            vals[3] = (jint)tzi.StandardDate.wDayOfWeek;
            vals[4] = (jint)tzi.StandardDate.wDay;
            vals[5] = (jint)tzi.StandardDate.wHour;
            vals[6] = (jint)tzi.StandardDate.wMinute;
            vals[7] = (jint)tzi.StandardDate.wSecond;
            vals[8] = (jint)tzi.StandardDate.wMilliseconds;
            vals[9] = (jint)tzi.StandardBias;
            vals[10] = (jint)tzi.DaylightDate.wYear;
            vals[11] = (jint)tzi.DaylightDate.wMonth;
            vals[12] = (jint)tzi.DaylightDate.wDayOfWeek;
            vals[13] = (jint)tzi.DaylightDate.wDay;
            vals[14] = (jint)tzi.DaylightDate.wHour;
            vals[15] = (jint)tzi.DaylightDate.wMinute;
            vals[16] = (jint)tzi.DaylightDate.wSecond;
            vals[17] = (jint)tzi.DaylightDate.wMilliseconds;
            vals[18] = (jint)tzi.DaylightBias;
            (*env)->SetIntArrayRegion(env, outInts, 0, 19, vals);
        }
        if (outStandardName != NULL) {
            (*env)->SetShortArrayRegion(env, outStandardName, 0, 32, (const jshort*)tzi.StandardName);
        }
        if (outDaylightName != NULL) {
            (*env)->SetShortArrayRegion(env, outDaylightName, 0, 32, (const jshort*)tzi.DaylightName);
        }
    }
    return (jint)res;
#else
    (void)env;
    (void)wYear;
    (void)outInts;
    (void)outStandardName;
    (void)outDaylightName;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SystemTimeToFileTime
  (JNIEnv *env, jclass cls, jlong lpSystemTime, jlong lpFileTime) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpSystemTime || !lpFileTime) {
        SetLastError(87);
        return 0;
    }
    return (jint)SystemTimeToFileTime(
        (const SYSTEMTIME*)(intptr_t)lpSystemTime,
        (LPFILETIME)(intptr_t)lpFileTime
    );
#else
    (void)lpSystemTime;
    (void)lpFileTime;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SystemTimeToFileTimeStruct
  (JNIEnv *env, jclass cls, jshortArray inSystemTime, jintArray outFileTime) {
    (void)cls;
#ifdef _WIN32
    if (!inSystemTime || !outFileTime) {
        SetLastError(87);
        return 0;
    }
    jshort stVals[8];
    (*env)->GetShortArrayRegion(env, inSystemTime, 0, 8, stVals);
    SYSTEMTIME st;
    st.wYear = (WORD)stVals[0];
    st.wMonth = (WORD)stVals[1];
    st.wDayOfWeek = (WORD)stVals[2];
    st.wDay = (WORD)stVals[3];
    st.wHour = (WORD)stVals[4];
    st.wMinute = (WORD)stVals[5];
    st.wSecond = (WORD)stVals[6];
    st.wMilliseconds = (WORD)stVals[7];
    FILETIME ft;
    ZeroMemory(&ft, sizeof(ft));
    BOOL res = SystemTimeToFileTime(&st, &ft);
    if (res) {
        jint ftVals[2];
        ftVals[0] = (jint)ft.dwLowDateTime;
        ftVals[1] = (jint)ft.dwHighDateTime;
        (*env)->SetIntArrayRegion(env, outFileTime, 0, 2, ftVals);
    }
    return (jint)res;
#else
    (void)env;
    (void)inSystemTime;
    (void)outFileTime;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SystemTimeToTzSpecificLocalTime
  (JNIEnv *env, jclass cls, jlong lpTimeZoneInformation, jlong lpUniversalTime, jlong lpLocalTime) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpUniversalTime || !lpLocalTime) {
        SetLastError(87);
        return 0;
    }
    return (jint)SystemTimeToTzSpecificLocalTime(
        (const TIME_ZONE_INFORMATION*)(intptr_t)lpTimeZoneInformation,
        (const SYSTEMTIME*)(intptr_t)lpUniversalTime,
        (LPSYSTEMTIME)(intptr_t)lpLocalTime
    );
#else
    (void)lpTimeZoneInformation;
    (void)lpUniversalTime;
    (void)lpLocalTime;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SystemTimeToTzSpecificLocalTimeStruct
  (JNIEnv *env, jclass cls, jshortArray inUniversalTime, jshortArray outLocalTime) {
    (void)cls;
#ifdef _WIN32
    if (!inUniversalTime || !outLocalTime) {
        SetLastError(87);
        return 0;
    }
    jshort stVals[8];
    (*env)->GetShortArrayRegion(env, inUniversalTime, 0, 8, stVals);
    SYSTEMTIME utc;
    utc.wYear = (WORD)stVals[0];
    utc.wMonth = (WORD)stVals[1];
    utc.wDayOfWeek = (WORD)stVals[2];
    utc.wDay = (WORD)stVals[3];
    utc.wHour = (WORD)stVals[4];
    utc.wMinute = (WORD)stVals[5];
    utc.wSecond = (WORD)stVals[6];
    utc.wMilliseconds = (WORD)stVals[7];
    SYSTEMTIME local;
    ZeroMemory(&local, sizeof(local));
    BOOL res = SystemTimeToTzSpecificLocalTime(NULL, &utc, &local);
    if (res) {
        jshort outVals[8];
        outVals[0] = (jshort)local.wYear;
        outVals[1] = (jshort)local.wMonth;
        outVals[2] = (jshort)local.wDayOfWeek;
        outVals[3] = (jshort)local.wDay;
        outVals[4] = (jshort)local.wHour;
        outVals[5] = (jshort)local.wMinute;
        outVals[6] = (jshort)local.wSecond;
        outVals[7] = (jshort)local.wMilliseconds;
        (*env)->SetShortArrayRegion(env, outLocalTime, 0, 8, outVals);
    }
    return (jint)res;
#else
    (void)env;
    (void)inUniversalTime;
    (void)outLocalTime;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_TzSpecificLocalTimeToSystemTime
  (JNIEnv *env, jclass cls, jlong lpTimeZoneInformation, jlong lpLocalTime, jlong lpUniversalTime) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpLocalTime || !lpUniversalTime) {
        SetLastError(87);
        return 0;
    }
    return (jint)TzSpecificLocalTimeToSystemTime(
        (const TIME_ZONE_INFORMATION*)(intptr_t)lpTimeZoneInformation,
        (const SYSTEMTIME*)(intptr_t)lpLocalTime,
        (LPSYSTEMTIME)(intptr_t)lpUniversalTime
    );
#else
    (void)lpTimeZoneInformation;
    (void)lpLocalTime;
    (void)lpUniversalTime;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_TzSpecificLocalTimeToSystemTimeStruct
  (JNIEnv *env, jclass cls, jshortArray inLocalTime, jshortArray outUniversalTime) {
    (void)cls;
#ifdef _WIN32
    if (!inLocalTime || !outUniversalTime) {
        SetLastError(87);
        return 0;
    }
    jshort stVals[8];
    (*env)->GetShortArrayRegion(env, inLocalTime, 0, 8, stVals);
    SYSTEMTIME local;
    local.wYear = (WORD)stVals[0];
    local.wMonth = (WORD)stVals[1];
    local.wDayOfWeek = (WORD)stVals[2];
    local.wDay = (WORD)stVals[3];
    local.wHour = (WORD)stVals[4];
    local.wMinute = (WORD)stVals[5];
    local.wSecond = (WORD)stVals[6];
    local.wMilliseconds = (WORD)stVals[7];
    SYSTEMTIME utc;
    ZeroMemory(&utc, sizeof(utc));
    BOOL res = TzSpecificLocalTimeToSystemTime(NULL, &local, &utc);
    if (res) {
        jshort outVals[8];
        outVals[0] = (jshort)utc.wYear;
        outVals[1] = (jshort)utc.wMonth;
        outVals[2] = (jshort)utc.wDayOfWeek;
        outVals[3] = (jshort)utc.wDay;
        outVals[4] = (jshort)utc.wHour;
        outVals[5] = (jshort)utc.wMinute;
        outVals[6] = (jshort)utc.wSecond;
        outVals[7] = (jshort)utc.wMilliseconds;
        (*env)->SetShortArrayRegion(env, outUniversalTime, 0, 8, outVals);
    }
    return (jint)res;
#else
    (void)env;
    (void)inLocalTime;
    (void)outUniversalTime;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_LockWorkStation
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SafeLockWorkStation();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_DisconnectNamedPipe
  (JNIEnv *env, jclass cls, jlong hNamedPipe) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)DisconnectNamedPipe((HANDLE)(intptr_t)hNamedPipe);
#else
    (void)hNamedPipe;
    return 0;
#endif
}

/* --- UI / Shell & System / Com --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SHGetKnownFolderPath
  (JNIEnv *env, jclass cls, jlong rfid, jint dwFlags, jlong hToken, jlongArray ppszPath) {
    (void)cls;
#ifdef _WIN32
    if (!rfid || !ppszPath) {
        return (jint)0x80070057;
    }
    PWSTR pathPtr = NULL;
    HRESULT hr = SafeSHGetKnownFolderPath(
        (const GUID*)(intptr_t)rfid,
        (DWORD)dwFlags,
        (HANDLE)(intptr_t)hToken,
        &pathPtr
    );
    jlong val = (jlong)(intptr_t)pathPtr;
    (*env)->SetLongArrayRegion(env, ppszPath, 0, 1, &val);
    return (jint)hr;
#else
    (void)env;
    (void)rfid;
    (void)dwFlags;
    (void)hToken;
    (void)ppszPath;
    return (jint)0x80004001;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SHGetKnownFolderPathGuid
  (JNIEnv *env, jclass cls, jint data1, jshort data2, jshort data3, jbyteArray data4,
   jint dwFlags, jlong hToken, jlongArray ppszPath) {
    (void)cls;
#ifdef _WIN32
    if (!data4 || !ppszPath) {
        return (jint)0x80070057;
    }
    GUID guid;
    guid.Data1 = (unsigned long)data1;
    guid.Data2 = (unsigned short)data2;
    guid.Data3 = (unsigned short)data3;
    (*env)->GetByteArrayRegion(env, data4, 0, 8, (jbyte*)guid.Data4);
    PWSTR pathPtr = NULL;
    HRESULT hr = SafeSHGetKnownFolderPath(&guid, (DWORD)dwFlags, (HANDLE)(intptr_t)hToken, &pathPtr);
    jlong val = (jlong)(intptr_t)pathPtr;
    (*env)->SetLongArrayRegion(env, ppszPath, 0, 1, &val);
    return (jint)hr;
#else
    (void)env;
    (void)data1;
    (void)data2;
    (void)data3;
    (void)data4;
    (void)dwFlags;
    (void)hToken;
    (void)ppszPath;
    return (jint)0x80004001;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_CoTaskMemFree
  (JNIEnv *env, jclass cls, jlong pv) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    SafeCoTaskMemFree((LPVOID)(intptr_t)pv);
#else
    (void)pv;
#endif
}

/* --- Globalization --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_lstrlenW
  (JNIEnv *env, jclass cls, jlong lpString) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpString) return 0;
    return (jint)lstrlenW((LPCWSTR)(intptr_t)lpString);
#else
    (void)lpString;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetUserPreferredUILanguages
  (JNIEnv *env, jclass cls, jint dwFlags, jintArray pulNumLanguages, jlong pwszLanguagesBuffer, jintArray pcchLanguagesBuffer) {
    (void)cls;
#ifdef _WIN32
    if (!pulNumLanguages || !pcchLanguagesBuffer) {
        SetLastError(87);
        return 0;
    }
    jint numLangsIn = 0;
    jint cchBufIn = 0;
    (*env)->GetIntArrayRegion(env, pulNumLanguages, 0, 1, &numLangsIn);
    (*env)->GetIntArrayRegion(env, pcchLanguagesBuffer, 0, 1, &cchBufIn);
    ULONG numLangs = (ULONG)numLangsIn;
    ULONG cchBuf = (ULONG)cchBufIn;
    BOOL res = SafeGetUserPreferredUILanguages(
        (DWORD)dwFlags,
        &numLangs,
        (LPWSTR)(intptr_t)pwszLanguagesBuffer,
        &cchBuf
    );
    jint numLangsOut = (jint)numLangs;
    jint cchBufOut = (jint)cchBuf;
    (*env)->SetIntArrayRegion(env, pulNumLanguages, 0, 1, &numLangsOut);
    (*env)->SetIntArrayRegion(env, pcchLanguagesBuffer, 0, 1, &cchBufOut);
    return (jint)res;
#else
    (void)env;
    (void)dwFlags;
    (void)pulNumLanguages;
    (void)pwszLanguagesBuffer;
    (void)pcchLanguagesBuffer;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetUserPreferredUILanguagesBuffer
  (JNIEnv *env, jclass cls, jint dwFlags, jintArray pulNumLanguages, jshortArray pwszLanguagesBuffer, jintArray pcchLanguagesBuffer) {
    (void)cls;
#ifdef _WIN32
    if (!pulNumLanguages || !pcchLanguagesBuffer) {
        SetLastError(87);
        return 0;
    }
    jint numLangsIn = 0;
    jint cchBufIn = 0;
    (*env)->GetIntArrayRegion(env, pulNumLanguages, 0, 1, &numLangsIn);
    (*env)->GetIntArrayRegion(env, pcchLanguagesBuffer, 0, 1, &cchBufIn);
    ULONG numLangs = (ULONG)numLangsIn;
    ULONG cchBuf = (ULONG)cchBufIn;
    jshort *bufPtr = NULL;
    if (pwszLanguagesBuffer != NULL) {
        bufPtr = (*env)->GetShortArrayElements(env, pwszLanguagesBuffer, NULL);
    }
    BOOL res = SafeGetUserPreferredUILanguages(
        (DWORD)dwFlags,
        &numLangs,
        (LPWSTR)bufPtr,
        &cchBuf
    );
    if (pwszLanguagesBuffer != NULL && bufPtr != NULL) {
        (*env)->ReleaseShortArrayElements(env, pwszLanguagesBuffer, bufPtr, 0);
    }
    jint numLangsOut = (jint)numLangs;
    jint cchBufOut = (jint)cchBuf;
    (*env)->SetIntArrayRegion(env, pulNumLanguages, 0, 1, &numLangsOut);
    (*env)->SetIntArrayRegion(env, pcchLanguagesBuffer, 0, 1, &cchBufOut);
    return (jint)res;
#else
    (void)env;
    (void)dwFlags;
    (void)pulNumLanguages;
    (void)pwszLanguagesBuffer;
    (void)pcchLanguagesBuffer;
    return 0;
#endif
}

/* --- System / Console --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetConsoleMode
  (JNIEnv *env, jclass cls, jlong hConsoleHandle, jintArray lpMode) {
    (void)cls;
#ifdef _WIN32
    if (!lpMode) {
        SetLastError(87);
        return 0;
    }
    DWORD mode = 0;
    BOOL res = GetConsoleMode((HANDLE)(intptr_t)hConsoleHandle, &mode);
    jint modeOut = (jint)mode;
    (*env)->SetIntArrayRegion(env, lpMode, 0, 1, &modeOut);
    return (jint)res;
#else
    (void)env;
    (void)hConsoleHandle;
    (void)lpMode;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetConsoleModePtr
  (JNIEnv *env, jclass cls, jlong hConsoleHandle, jlong lpMode) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpMode) {
        SetLastError(87);
        return 0;
    }
    return (jint)GetConsoleMode((HANDLE)(intptr_t)hConsoleHandle, (LPDWORD)(intptr_t)lpMode);
#else
    (void)hConsoleHandle;
    (void)lpMode;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetConsoleMode
  (JNIEnv *env, jclass cls, jlong hConsoleHandle, jint dwMode) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SetConsoleMode((HANDLE)(intptr_t)hConsoleHandle, (DWORD)dwMode);
#else
    (void)hConsoleHandle;
    (void)dwMode;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetStdHandle
  (JNIEnv *env, jclass cls, jint nStdHandle) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetStdHandle((DWORD)nStdHandle);
#else
    (void)nStdHandle;
    return -1;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetConsoleScreenBufferInfo
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jlong lpConsoleScreenBufferInfo) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpConsoleScreenBufferInfo) {
        SetLastError(87);
        return 0;
    }
    return (jint)GetConsoleScreenBufferInfo(
        (HANDLE)(intptr_t)hConsoleOutput,
        (PCONSOLE_SCREEN_BUFFER_INFO)(intptr_t)lpConsoleScreenBufferInfo
    );
#else
    (void)hConsoleOutput;
    (void)lpConsoleScreenBufferInfo;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetConsoleScreenBufferInfoStruct
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jintArray outFields) {
    (void)cls;
#ifdef _WIN32
    if (!outFields) {
        SetLastError(87);
        return 0;
    }
    CONSOLE_SCREEN_BUFFER_INFO info;
    ZeroMemory(&info, sizeof(info));
    BOOL res = GetConsoleScreenBufferInfo((HANDLE)(intptr_t)hConsoleOutput, &info);
    if (res) {
        jint vals[11];
        vals[0] = (jint)info.dwSize.X;
        vals[1] = (jint)info.dwSize.Y;
        vals[2] = (jint)info.dwCursorPosition.X;
        vals[3] = (jint)info.dwCursorPosition.Y;
        vals[4] = (jint)info.wAttributes;
        vals[5] = (jint)info.srWindow.Left;
        vals[6] = (jint)info.srWindow.Top;
        vals[7] = (jint)info.srWindow.Right;
        vals[8] = (jint)info.srWindow.Bottom;
        vals[9] = (jint)info.dwMaximumWindowSize.X;
        vals[10] = (jint)info.dwMaximumWindowSize.Y;
        (*env)->SetIntArrayRegion(env, outFields, 0, 11, vals);
    }
    return (jint)res;
#else
    (void)env;
    (void)hConsoleOutput;
    (void)outFields;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetConsoleTextAttribute
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jint wAttributes) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SetConsoleTextAttribute((HANDLE)(intptr_t)hConsoleOutput, (WORD)wAttributes);
#else
    (void)hConsoleOutput;
    (void)wAttributes;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetConsoleCursorInfo
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jlong lpConsoleCursorInfo) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpConsoleCursorInfo) {
        SetLastError(87);
        return 0;
    }
    return (jint)GetConsoleCursorInfo(
        (HANDLE)(intptr_t)hConsoleOutput,
        (PCONSOLE_CURSOR_INFO)(intptr_t)lpConsoleCursorInfo
    );
#else
    (void)hConsoleOutput;
    (void)lpConsoleCursorInfo;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetConsoleCursorInfoStruct
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jintArray outFields) {
    (void)cls;
#ifdef _WIN32
    if (!outFields) {
        SetLastError(87);
        return 0;
    }
    CONSOLE_CURSOR_INFO info;
    ZeroMemory(&info, sizeof(info));
    BOOL res = GetConsoleCursorInfo((HANDLE)(intptr_t)hConsoleOutput, &info);
    if (res) {
        jint vals[2];
        vals[0] = (jint)info.dwSize;
        vals[1] = (jint)info.bVisible;
        (*env)->SetIntArrayRegion(env, outFields, 0, 2, vals);
    }
    return (jint)res;
#else
    (void)env;
    (void)hConsoleOutput;
    (void)outFields;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetConsoleCursorInfo
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jlong lpConsoleCursorInfo) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpConsoleCursorInfo) {
        SetLastError(87);
        return 0;
    }
    return (jint)SetConsoleCursorInfo(
        (HANDLE)(intptr_t)hConsoleOutput,
        (const CONSOLE_CURSOR_INFO*)(intptr_t)lpConsoleCursorInfo
    );
#else
    (void)hConsoleOutput;
    (void)lpConsoleCursorInfo;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetConsoleCursorInfoStruct
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jint dwSize, jint bVisible) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    CONSOLE_CURSOR_INFO info;
    info.dwSize = (DWORD)dwSize;
    info.bVisible = (BOOL)bVisible;
    return (jint)SetConsoleCursorInfo((HANDLE)(intptr_t)hConsoleOutput, &info);
#else
    (void)hConsoleOutput;
    (void)dwSize;
    (void)bVisible;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetConsoleCursorPosition
  (JNIEnv *env, jclass cls, jlong hConsoleOutput, jshort x, jshort y) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    COORD pos;
    pos.X = (SHORT)x;
    pos.Y = (SHORT)y;
    return (jint)SetConsoleCursorPosition((HANDLE)(intptr_t)hConsoleOutput, pos);
#else
    (void)hConsoleOutput;
    (void)x;
    (void)y;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetNumberOfConsoleInputEvents
  (JNIEnv *env, jclass cls, jlong hConsoleInput, jintArray lpcNumberOfEvents) {
    (void)cls;
#ifdef _WIN32
    if (!lpcNumberOfEvents) {
        SetLastError(87);
        return 0;
    }
    DWORD events = 0;
    BOOL res = GetNumberOfConsoleInputEvents((HANDLE)(intptr_t)hConsoleInput, &events);
    jint outVal = (jint)events;
    (*env)->SetIntArrayRegion(env, lpcNumberOfEvents, 0, 1, &outVal);
    return (jint)res;
#else
    (void)env;
    (void)hConsoleInput;
    (void)lpcNumberOfEvents;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetNumberOfConsoleInputEventsPtr
  (JNIEnv *env, jclass cls, jlong hConsoleInput, jlong lpcNumberOfEvents) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpcNumberOfEvents) {
        SetLastError(87);
        return 0;
    }
    return (jint)GetNumberOfConsoleInputEvents(
        (HANDLE)(intptr_t)hConsoleInput,
        (LPDWORD)(intptr_t)lpcNumberOfEvents
    );
#else
    (void)hConsoleInput;
    (void)lpcNumberOfEvents;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_ReadConsoleInputW
  (JNIEnv *env, jclass cls, jlong hConsoleInput, jlong lpBuffer, jint nLength, jintArray lpNumberOfEventsRead) {
    (void)cls;
#ifdef _WIN32
    if (!lpBuffer || !lpNumberOfEventsRead) {
        SetLastError(87);
        return 0;
    }
    DWORD eventsRead = 0;
    BOOL res = ReadConsoleInputW(
        (HANDLE)(intptr_t)hConsoleInput,
        (PINPUT_RECORD)(intptr_t)lpBuffer,
        (DWORD)nLength,
        &eventsRead
    );
    jint outVal = (jint)eventsRead;
    (*env)->SetIntArrayRegion(env, lpNumberOfEventsRead, 0, 1, &outVal);
    return (jint)res;
#else
    (void)env;
    (void)hConsoleInput;
    (void)lpBuffer;
    (void)nLength;
    (void)lpNumberOfEventsRead;
    return 0;
#endif
}

/* --- System / LibraryLoader --- */

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_LoadLibraryW
  (JNIEnv *env, jclass cls, jlong lpLibFileName) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpLibFileName) {
        SetLastError(87);
        return 0;
    }
    return (jlong)(intptr_t)LoadLibraryW((LPCWSTR)(intptr_t)lpLibFileName);
#else
    (void)lpLibFileName;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetProcAddress
  (JNIEnv *env, jclass cls, jlong hModule, jlong lpProcName) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpProcName) {
        SetLastError(87);
        return 0;
    }
    return (jlong)(intptr_t)GetProcAddress((HMODULE)(intptr_t)hModule, (LPCSTR)(intptr_t)lpProcName);
#else
    (void)hModule;
    (void)lpProcName;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetModuleHandleW
  (JNIEnv *env, jclass cls, jlong lpModuleName) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetModuleHandleW((LPCWSTR)(intptr_t)lpModuleName);
#else
    (void)lpModuleName;
    return 0;
#endif
}

/* --- Storage / FileSystem additions --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFullPathNameW
  (JNIEnv *env, jclass cls, jlong lpFileName, jint nBufferLength, jlong lpBuffer, jlongArray lpFilePart) {
    (void)cls;
#ifdef _WIN32
    if (!lpFileName) {
        SetLastError(87);
        return 0;
    }
    LPWSTR filePart = NULL;
    DWORD res = GetFullPathNameW(
        (LPCWSTR)(intptr_t)lpFileName,
        (DWORD)nBufferLength,
        (LPWSTR)(intptr_t)lpBuffer,
        lpFilePart != NULL ? &filePart : NULL
    );
    if (lpFilePart != NULL) {
        jlong outPart = (jlong)(intptr_t)filePart;
        (*env)->SetLongArrayRegion(env, lpFilePart, 0, 1, &outPart);
    }
    return (jint)res;
#else
    (void)env;
    (void)lpFileName;
    (void)nBufferLength;
    (void)lpBuffer;
    (void)lpFilePart;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFullPathNameWBuffer
  (JNIEnv *env, jclass cls, jshortArray lpFileName, jint nBufferLength, jshortArray lpBuffer, jlongArray lpFilePart) {
    (void)cls;
#ifdef _WIN32
    if (!lpFileName) {
        SetLastError(87);
        return 0;
    }
    jshort *inPtr = (*env)->GetShortArrayElements(env, lpFileName, NULL);
    jshort *outPtr = NULL;
    if (lpBuffer != NULL) {
        outPtr = (*env)->GetShortArrayElements(env, lpBuffer, NULL);
    }
    LPWSTR filePart = NULL;
    DWORD res = GetFullPathNameW(
        (LPCWSTR)inPtr,
        (DWORD)nBufferLength,
        (LPWSTR)outPtr,
        lpFilePart != NULL ? &filePart : NULL
    );
    if (lpFilePart != NULL && outPtr != NULL && filePart != NULL) {
        jlong offsetChars = (jlong)(filePart - (LPWSTR)outPtr);
        (*env)->SetLongArrayRegion(env, lpFilePart, 0, 1, &offsetChars);
    }
    if (lpBuffer != NULL && outPtr != NULL) {
        (*env)->ReleaseShortArrayElements(env, lpBuffer, outPtr, 0);
    }
    if (inPtr != NULL) {
        (*env)->ReleaseShortArrayElements(env, lpFileName, inPtr, JNI_ABORT);
    }
    return (jint)res;
#else
    (void)env;
    (void)lpFileName;
    (void)nBufferLength;
    (void)lpBuffer;
    (void)lpFilePart;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFileInformationByHandle
  (JNIEnv *env, jclass cls, jlong hFile, jlong lpFileInformation) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    if (!lpFileInformation) {
        SetLastError(87);
        return 0;
    }
    return (jint)GetFileInformationByHandle(
        (HANDLE)(intptr_t)hFile,
        (LPBY_HANDLE_FILE_INFORMATION)(intptr_t)lpFileInformation
    );
#else
    (void)hFile;
    (void)lpFileInformation;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFileInformationByHandleStruct
  (JNIEnv *env, jclass cls, jlong hFile, jintArray outFields) {
    (void)cls;
#ifdef _WIN32
    if (!outFields) {
        SetLastError(87);
        return 0;
    }
    BY_HANDLE_FILE_INFORMATION info;
    ZeroMemory(&info, sizeof(info));
    BOOL res = GetFileInformationByHandle((HANDLE)(intptr_t)hFile, &info);
    if (res) {
        jint vals[13];
        vals[0] = (jint)info.dwFileAttributes;
        vals[1] = (jint)info.ftCreationTime.dwLowDateTime;
        vals[2] = (jint)info.ftCreationTime.dwHighDateTime;
        vals[3] = (jint)info.ftLastAccessTime.dwLowDateTime;
        vals[4] = (jint)info.ftLastAccessTime.dwHighDateTime;
        vals[5] = (jint)info.ftLastWriteTime.dwLowDateTime;
        vals[6] = (jint)info.ftLastWriteTime.dwHighDateTime;
        vals[7] = (jint)info.dwVolumeSerialNumber;
        vals[8] = (jint)info.nFileSizeHigh;
        vals[9] = (jint)info.nFileSizeLow;
        vals[10] = (jint)info.nNumberOfLinks;
        vals[11] = (jint)info.nFileIndexHigh;
        vals[12] = (jint)info.nFileIndexLow;
        (*env)->SetIntArrayRegion(env, outFields, 0, 13, vals);
    }
    return (jint)res;
#else
    (void)env;
    (void)hFile;
    (void)outFields;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetFileType
  (JNIEnv *env, jclass cls, jlong hFile) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)GetFileType((HANDLE)(intptr_t)hFile);
#else
    (void)hFile;
    return 0;
#endif
}

/* --- System / SystemInformation --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetComputerNameExW
  (JNIEnv *env, jclass cls, jint nameType, jlong lpBuffer, jintArray nSize) {
    (void)cls;
#ifdef _WIN32
    if (!nSize) {
        SetLastError(87);
        return 0;
    }
    jint sizeIn = 0;
    (*env)->GetIntArrayRegion(env, nSize, 0, 1, &sizeIn);
    DWORD sz = (DWORD)sizeIn;
    BOOL res = GetComputerNameExW(
        (COMPUTER_NAME_FORMAT)nameType,
        (LPWSTR)(intptr_t)lpBuffer,
        &sz
    );
    jint sizeOut = (jint)sz;
    (*env)->SetIntArrayRegion(env, nSize, 0, 1, &sizeOut);
    return (jint)res;
#else
    (void)env;
    (void)nameType;
    (void)lpBuffer;
    (void)nSize;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetComputerNameExWBuffer
  (JNIEnv *env, jclass cls, jint nameType, jshortArray lpBuffer, jintArray nSize) {
    (void)cls;
#ifdef _WIN32
    if (!nSize) {
        SetLastError(87);
        return 0;
    }
    jint sizeIn = 0;
    (*env)->GetIntArrayRegion(env, nSize, 0, 1, &sizeIn);
    DWORD sz = (DWORD)sizeIn;
    jshort *bufPtr = NULL;
    if (lpBuffer != NULL) {
        bufPtr = (*env)->GetShortArrayElements(env, lpBuffer, NULL);
    }
    BOOL res = GetComputerNameExW(
        (COMPUTER_NAME_FORMAT)nameType,
        (LPWSTR)bufPtr,
        &sz
    );
    if (lpBuffer != NULL && bufPtr != NULL) {
        (*env)->ReleaseShortArrayElements(env, lpBuffer, bufPtr, 0);
    }
    jint sizeOut = (jint)sz;
    (*env)->SetIntArrayRegion(env, nSize, 0, 1, &sizeOut);
    return (jint)res;
#else
    (void)env;
    (void)nameType;
    (void)lpBuffer;
    (void)nSize;
    return 0;
#endif
}

/* --- System / Environment --- */

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetEnvironmentVariableA
  (JNIEnv *env, jclass cls, jlong lpName, jlong lpValue) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)SetEnvironmentVariableA((LPCSTR)(intptr_t)lpName, (LPCSTR)(intptr_t)lpValue);
#else
    (void)lpName; (void)lpValue;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetEnvironmentVariableW
  (JNIEnv *env, jclass cls, jlong lpName, jlong lpValue) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)SetEnvironmentVariableW((LPCWSTR)(intptr_t)lpName, (LPCWSTR)(intptr_t)lpValue);
#else
    (void)lpName; (void)lpValue;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetEnvironmentVariableWBuffer
  (JNIEnv *env, jclass cls, jshortArray lpName, jshortArray lpValue) {
    (void)cls;
#ifdef _WIN32
    if (!lpName) return 0;
    jshort *namePtr = (*env)->GetShortArrayElements(env, lpName, NULL);
    jshort *valPtr = lpValue != NULL ? (*env)->GetShortArrayElements(env, lpValue, NULL) : NULL;
    BOOL res = SetEnvironmentVariableW((LPCWSTR)namePtr, (LPCWSTR)valPtr);
    if (valPtr) (*env)->ReleaseShortArrayElements(env, lpValue, valPtr, JNI_ABORT);
    (*env)->ReleaseShortArrayElements(env, lpName, namePtr, JNI_ABORT);
    return (jint)res;
#else
    (void)env; (void)lpName; (void)lpValue;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetEnvironmentVariableA
  (JNIEnv *env, jclass cls, jlong lpName, jlong lpBuffer, jint nSize) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)GetEnvironmentVariableA((LPCSTR)(intptr_t)lpName, (LPSTR)(intptr_t)lpBuffer, (DWORD)nSize);
#else
    (void)lpName; (void)lpBuffer; (void)nSize;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetEnvironmentVariableW
  (JNIEnv *env, jclass cls, jlong lpName, jlong lpBuffer, jint nSize) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)GetEnvironmentVariableW((LPCWSTR)(intptr_t)lpName, (LPWSTR)(intptr_t)lpBuffer, (DWORD)nSize);
#else
    (void)lpName; (void)lpBuffer; (void)nSize;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetEnvironmentVariableWBuffer
  (JNIEnv *env, jclass cls, jshortArray lpName, jshortArray lpBuffer, jint nSize) {
    (void)cls;
#ifdef _WIN32
    if (!lpName) return 0;
    jshort *namePtr = (*env)->GetShortArrayElements(env, lpName, NULL);
    jshort *bufPtr = lpBuffer != NULL ? (*env)->GetShortArrayElements(env, lpBuffer, NULL) : NULL;
    DWORD res = GetEnvironmentVariableW((LPCWSTR)namePtr, (LPWSTR)bufPtr, (DWORD)nSize);
    if (bufPtr) (*env)->ReleaseShortArrayElements(env, lpBuffer, bufPtr, 0);
    (*env)->ReleaseShortArrayElements(env, lpName, namePtr, JNI_ABORT);
    return (jint)res;
#else
    (void)env; (void)lpName; (void)lpBuffer; (void)nSize;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_ExpandEnvironmentStringsA
  (JNIEnv *env, jclass cls, jlong lpSrc, jlong lpDst, jint nSize) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)ExpandEnvironmentStringsA((LPCSTR)(intptr_t)lpSrc, (LPSTR)(intptr_t)lpDst, (DWORD)nSize);
#else
    (void)lpSrc; (void)lpDst; (void)nSize;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_ExpandEnvironmentStringsW
  (JNIEnv *env, jclass cls, jlong lpSrc, jlong lpDst, jint nSize) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)ExpandEnvironmentStringsW((LPCWSTR)(intptr_t)lpSrc, (LPWSTR)(intptr_t)lpDst, (DWORD)nSize);
#else
    (void)lpSrc; (void)lpDst; (void)nSize;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_ExpandEnvironmentStringsWBuffer
  (JNIEnv *env, jclass cls, jshortArray lpSrc, jshortArray lpDst, jint nSize) {
    (void)cls;
#ifdef _WIN32
    if (!lpSrc) return 0;
    jshort *srcPtr = (*env)->GetShortArrayElements(env, lpSrc, NULL);
    jshort *dstPtr = lpDst != NULL ? (*env)->GetShortArrayElements(env, lpDst, NULL) : NULL;
    DWORD res = ExpandEnvironmentStringsW((LPCWSTR)srcPtr, (LPWSTR)dstPtr, (DWORD)nSize);
    if (dstPtr) (*env)->ReleaseShortArrayElements(env, lpDst, dstPtr, 0);
    (*env)->ReleaseShortArrayElements(env, lpSrc, srcPtr, JNI_ABORT);
    return (jint)res;
#else
    (void)env; (void)lpSrc; (void)lpDst; (void)nSize;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetEnvironmentStrings
  (JNIEnv *env, jclass cls) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetEnvironmentStrings();
#else
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetEnvironmentStringsW
  (JNIEnv *env, jclass cls) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetEnvironmentStringsW();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_FreeEnvironmentStringsA
  (JNIEnv *env, jclass cls, jlong penv) {
    (void)env; (void)cls;
#ifdef _WIN32
    if (!penv) return 0;
    return (jint)FreeEnvironmentStringsA((LPCH)(intptr_t)penv);
#else
    (void)penv;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_FreeEnvironmentStringsW
  (JNIEnv *env, jclass cls, jlong penv) {
    (void)env; (void)cls;
#ifdef _WIN32
    if (!penv) return 0;
    return (jint)FreeEnvironmentStringsW((LPWCH)(intptr_t)penv);
#else
    (void)penv;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetEnvironmentStringsW
  (JNIEnv *env, jclass cls, jlong newEnvironment) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)SetEnvironmentStringsW((LPWCH)(intptr_t)newEnvironment);
#else
    (void)newEnvironment;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCurrentDirectoryA
  (JNIEnv *env, jclass cls, jint nBufferLength, jlong lpBuffer) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)GetCurrentDirectoryA((DWORD)nBufferLength, (LPSTR)(intptr_t)lpBuffer);
#else
    (void)nBufferLength; (void)lpBuffer;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCurrentDirectoryW
  (JNIEnv *env, jclass cls, jint nBufferLength, jlong lpBuffer) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)GetCurrentDirectoryW((DWORD)nBufferLength, (LPWSTR)(intptr_t)lpBuffer);
#else
    (void)nBufferLength; (void)lpBuffer;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCurrentDirectoryWBuffer
  (JNIEnv *env, jclass cls, jint nBufferLength, jshortArray lpBuffer) {
    (void)cls;
#ifdef _WIN32
    jshort *bufPtr = lpBuffer != NULL ? (*env)->GetShortArrayElements(env, lpBuffer, NULL) : NULL;
    DWORD res = GetCurrentDirectoryW((DWORD)nBufferLength, (LPWSTR)bufPtr);
    if (bufPtr) (*env)->ReleaseShortArrayElements(env, lpBuffer, bufPtr, 0);
    return (jint)res;
#else
    (void)env; (void)nBufferLength; (void)lpBuffer;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetCurrentDirectoryA
  (JNIEnv *env, jclass cls, jlong lpPathName) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)SetCurrentDirectoryA((LPCSTR)(intptr_t)lpPathName);
#else
    (void)lpPathName;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetCurrentDirectoryW
  (JNIEnv *env, jclass cls, jlong lpPathName) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)SetCurrentDirectoryW((LPCWSTR)(intptr_t)lpPathName);
#else
    (void)lpPathName;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetCurrentDirectoryWBuffer
  (JNIEnv *env, jclass cls, jshortArray lpPathName) {
    (void)cls;
#ifdef _WIN32
    if (!lpPathName) return 0;
    jshort *pathPtr = (*env)->GetShortArrayElements(env, lpPathName, NULL);
    BOOL res = SetCurrentDirectoryW((LPCWSTR)pathPtr);
    (*env)->ReleaseShortArrayElements(env, lpPathName, pathPtr, JNI_ABORT);
    return (jint)res;
#else
    (void)env; (void)lpPathName;
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCommandLineA
  (JNIEnv *env, jclass cls) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetCommandLineA();
#else
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetCommandLineW
  (JNIEnv *env, jclass cls) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)GetCommandLineW();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_NeedCurrentDirectoryForExePathA
  (JNIEnv *env, jclass cls, jlong exeName) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)NeedCurrentDirectoryForExePathA((LPCSTR)(intptr_t)exeName);
#else
    (void)exeName;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_NeedCurrentDirectoryForExePathW
  (JNIEnv *env, jclass cls, jlong exeName) {
    (void)env; (void)cls;
#ifdef _WIN32
    return (jint)NeedCurrentDirectoryForExePathW((LPCWSTR)(intptr_t)exeName);
#else
    (void)exeName;
    return 0;
#endif
}

#ifdef __cplusplus
}
#endif
