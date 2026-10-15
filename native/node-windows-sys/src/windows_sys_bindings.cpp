#include <napi.h>

#if defined(_WIN32) || defined(WIN32)
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <oleauto.h>
#define IS_WINDOWS 1

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
    return (HRESULT)0x80004001;
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

#else
#define IS_WINDOWS 0
#endif


/* --- Foundation Bindings --- */

Napi::Value CloseHandleBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) {
        Napi::TypeError::New(env, "Handle argument required").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL result = CloseHandle(reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)));
    return Napi::Number::New(env, result);
#else
    (void)handleVal;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value GetLastErrorBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    DWORD err = GetLastError();
    return Napi::Number::New(env, static_cast<uint32_t>(err));
#else
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SetLastErrorBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        uint32_t err = info[0].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
        SetLastError(err);
#else
        (void)err;
#endif
    }
    return env.Undefined();
}

Napi::Value SetLastErrorExBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 2) {
        uint32_t err = info[0].As<Napi::Number>().Uint32Value();
        uint32_t type = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
        SafeSetLastErrorEx(err, type);
#else
        (void)err; (void)type;
#endif
    }
    return env.Undefined();
}

Napi::Value LocalFreeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) {
        return env.Null();
    }
    int64_t ptrVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    HLOCAL res = LocalFree(reinterpret_cast<HLOCAL>(static_cast<intptr_t>(ptrVal)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)ptrVal;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GlobalFreeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t ptrVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    HGLOBAL res = GlobalFree(reinterpret_cast<HGLOBAL>(static_cast<intptr_t>(ptrVal)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)ptrVal;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value FreeLibraryBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL result = FreeLibrary(reinterpret_cast<HMODULE>(static_cast<intptr_t>(h)));
    return Napi::Number::New(env, result);
#else
    (void)h;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value SetHandleInformationBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) {
        Napi::TypeError::New(env, "3 arguments required: handle, mask, flags").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
    uint32_t mask = info[1].As<Napi::Number>().Uint32Value();
    uint32_t flags = info[2].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL result = SetHandleInformation(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)),
        static_cast<DWORD>(mask),
        static_cast<DWORD>(flags)
    );
    return Napi::Number::New(env, result);
#else
    (void)handleVal; (void)mask; (void)flags;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value GetHandleInformationBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return env.Null();
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD flags = 0;
    BOOL result = GetHandleInformation(reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)), &flags);
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, result));
    obj.Set("flags", Napi::Number::New(env, flags));
    return obj;
#else
    (void)handleVal;
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, 1));
    obj.Set("flags", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value CompareObjectHandlesBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h1 = info[0].As<Napi::Number>().Int64Value();
    int64_t h2 = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL result = SafeCompareObjectHandles(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h1)),
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h2))
    );
    return Napi::Number::New(env, result);
#else
    return Napi::Number::New(env, h1 == h2 ? 1 : 0);
#endif
}

Napi::Value DuplicateHandleBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 6) {
        Napi::TypeError::New(env, "Arguments required for DuplicateHandle").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t hSourceProcess = info[0].As<Napi::Number>().Int64Value();
    int64_t hSource = info[1].As<Napi::Number>().Int64Value();
    int64_t hTargetProcess = info[2].As<Napi::Number>().Int64Value();
    uint32_t dwDesiredAccess = info[3].As<Napi::Number>().Uint32Value();
    bool bInheritHandle = info[4].As<Napi::Boolean>().Value();
    uint32_t dwOptions = info[5].As<Napi::Number>().Uint32Value();

#if IS_WINDOWS
    HANDLE targetHandle = NULL;
    BOOL result = DuplicateHandle(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(hSourceProcess)),
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(hSource)),
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(hTargetProcess)),
        &targetHandle,
        static_cast<DWORD>(dwDesiredAccess),
        bInheritHandle ? TRUE : FALSE,
        static_cast<DWORD>(dwOptions)
    );
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, result));
    obj.Set("targetHandle", Napi::Number::New(env, reinterpret_cast<intptr_t>(targetHandle)));
    return obj;
#else
    (void)hSourceProcess; (void)hSource; (void)hTargetProcess;
    (void)dwDesiredAccess; (void)bInheritHandle; (void)dwOptions;
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, 1));
    obj.Set("targetHandle", Napi::Number::New(env, 100));
    return obj;
#endif
}

Napi::Value RtlNtStatusToDosErrorBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int32_t status = info[0].As<Napi::Number>().Int32Value();
#if IS_WINDOWS
    ULONG err = SafeRtlNtStatusToDosError(static_cast<LONG>(status));
    return Napi::Number::New(env, static_cast<uint32_t>(err));
#else
    (void)status;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysAllocStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t psz = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BSTR res = SysAllocString(reinterpret_cast<const OLECHAR*>(static_cast<intptr_t>(psz)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)psz;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysAllocStringByteLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t psz = info[0].As<Napi::Number>().Int64Value();
    uint32_t len = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BSTR res = SysAllocStringByteLen(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(psz)), len);
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)psz; (void)len;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysAllocStringLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t strIn = info[0].As<Napi::Number>().Int64Value();
    uint32_t ui = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BSTR res = SysAllocStringLen(reinterpret_cast<const OLECHAR*>(static_cast<intptr_t>(strIn)), ui);
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)strIn; (void)ui;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysFreeStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
        SysFreeString(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
#else
        (void)bstr;
#endif
    }
    return env.Undefined();
}

Napi::Value SysAddRefStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    HRESULT hr = SysAddRefString(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
    return Napi::Number::New(env, hr);
#else
    (void)bstr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysReleaseStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
        SysReleaseString(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
#else
        (void)bstr;
#endif
    }
    return env.Undefined();
}

Napi::Value SysStringByteLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    UINT len = SysStringByteLen(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
    return Napi::Number::New(env, len);
#else
    (void)bstr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysStringLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t pbstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    UINT len = SysStringLen(reinterpret_cast<BSTR>(static_cast<intptr_t>(pbstr)));
    return Napi::Number::New(env, len);
#else
    (void)pbstr;
    return Napi::Number::New(env, 0);
#endif
}

/* --- Storage / FileSystem Bindings --- */

Napi::Value SetFileAttributesWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
    uint32_t attr = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = SetFileAttributesW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(path)), attr);
    return Napi::Number::New(env, res);
#else
    (void)path; (void)attr;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value SetFileAttributesABinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
    uint32_t attr = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = SetFileAttributesA(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(path)), attr);
    return Napi::Number::New(env, res);
#else
    (void)path; (void)attr;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value GetFileAttributesWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, -1);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD res = GetFileAttributesW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, static_cast<uint32_t>(res));
#else
    (void)path;
    return Napi::Number::New(env, -1);
#endif
}

Napi::Value GetFileAttributesABinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, -1);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD res = GetFileAttributesA(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, static_cast<uint32_t>(res));
#else
    (void)path;
    return Napi::Number::New(env, -1);
#endif
}

Napi::Value DeleteFileWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = DeleteFileW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, res);
#else
    (void)path;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value DeleteFileABinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = DeleteFileA(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, res);
#else
    (void)path;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value FlushFileBuffersBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = FlushFileBuffers(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)));
    return Napi::Number::New(env, res);
#else
    (void)h;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value AreFileApisANSIBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    BOOL res = AreFileApisANSI();
    return Napi::Number::New(env, res);
#else
    return Napi::Number::New(env, 1);
#endif
}

/* --- System / Threading Bindings --- */

Napi::Value GetCurrentProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    HANDLE h = GetCurrentProcess();
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    return Napi::Number::New(env, -1);
#endif
}

Napi::Value GetCurrentProcessIdBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    DWORD pid = GetCurrentProcessId();
    return Napi::Number::New(env, pid);
#else
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetCurrentThreadBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    HANDLE h = GetCurrentThread();
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    return Napi::Number::New(env, -2);
#endif
}

Napi::Value GetCurrentThreadIdBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    DWORD tid = GetCurrentThreadId();
    return Napi::Number::New(env, tid);
#else
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value TerminateProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    uint32_t code = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = TerminateProcess(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)), code);
    return Napi::Number::New(env, res);
#else
    (void)h; (void)code;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value ExitProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        uint32_t code = info[0].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
        ExitProcess(code);
#else
        (void)code;
#endif
    }
    return env.Undefined();
}

Napi::Value OpenProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) return Napi::Number::New(env, 0);
    uint32_t access = info[0].As<Napi::Number>().Uint32Value();
    bool inherit = info[1].As<Napi::Boolean>().Value();
    uint32_t pid = info[2].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    HANDLE h = OpenProcess(access, inherit ? TRUE : FALSE, pid);
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    (void)access; (void)inherit; (void)pid;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value K32EmptyWorkingSetBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) {
        Napi::TypeError::New(env, "hProcess argument required").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = SafeK32EmptyWorkingSet(reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)));
    return Napi::Number::New(env, res);
#else
    (void)handleVal;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetTimeZoneInformationBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    int64_t ptrVal = 0;
    if (info.Length() >= 1 && !info[0].IsNull() && !info[0].IsUndefined()) {
        ptrVal = info[0].As<Napi::Number>().Int64Value();
    }
#if IS_WINDOWS
    if (ptrVal == 0) {
        SetLastError(87);
        return Napi::Number::New(env, static_cast<uint32_t>(0xFFFFFFFF));
    }
    DWORD res = GetTimeZoneInformation(reinterpret_cast<LPTIME_ZONE_INFORMATION>(static_cast<intptr_t>(ptrVal)));
    return Napi::Number::New(env, static_cast<uint32_t>(res));
#else
    (void)ptrVal;
    return Napi::Number::New(env, 0xFFFFFFFF);
#endif
}

Napi::Value GetTimeZoneInformationForYearBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) return Napi::Number::New(env, 0);
    uint32_t wYear = info[0].As<Napi::Number>().Uint32Value();
    int64_t pdtzi = info[1].As<Napi::Number>().Int64Value();
    int64_t ptzi = info[2].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (ptzi == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = SafeGetTimeZoneInformationForYear(
        static_cast<USHORT>(wYear),
        reinterpret_cast<PVOID>(static_cast<intptr_t>(pdtzi)),
        reinterpret_cast<LPTIME_ZONE_INFORMATION>(static_cast<intptr_t>(ptzi))
    );
    return Napi::Number::New(env, res);
#else
    (void)wYear; (void)pdtzi; (void)ptzi;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SystemTimeToFileTimeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t st = info[0].As<Napi::Number>().Int64Value();
    int64_t ft = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (st == 0 || ft == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = SystemTimeToFileTime(
        reinterpret_cast<const SYSTEMTIME*>(static_cast<intptr_t>(st)),
        reinterpret_cast<LPFILETIME>(static_cast<intptr_t>(ft))
    );
    return Napi::Number::New(env, res);
#else
    (void)st; (void)ft;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SystemTimeToTzSpecificLocalTimeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) return Napi::Number::New(env, 0);
    int64_t tz = info[0].As<Napi::Number>().Int64Value();
    int64_t utc = info[1].As<Napi::Number>().Int64Value();
    int64_t local = info[2].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (utc == 0 || local == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = SystemTimeToTzSpecificLocalTime(
        reinterpret_cast<const TIME_ZONE_INFORMATION*>(static_cast<intptr_t>(tz)),
        reinterpret_cast<const SYSTEMTIME*>(static_cast<intptr_t>(utc)),
        reinterpret_cast<LPSYSTEMTIME>(static_cast<intptr_t>(local))
    );
    return Napi::Number::New(env, res);
#else
    (void)tz; (void)utc; (void)local;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value TzSpecificLocalTimeToSystemTimeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) return Napi::Number::New(env, 0);
    int64_t tz = info[0].As<Napi::Number>().Int64Value();
    int64_t local = info[1].As<Napi::Number>().Int64Value();
    int64_t utc = info[2].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (local == 0 || utc == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = TzSpecificLocalTimeToSystemTime(
        reinterpret_cast<const TIME_ZONE_INFORMATION*>(static_cast<intptr_t>(tz)),
        reinterpret_cast<const SYSTEMTIME*>(static_cast<intptr_t>(local)),
        reinterpret_cast<LPSYSTEMTIME>(static_cast<intptr_t>(utc))
    );
    return Napi::Number::New(env, res);
#else
    (void)tz; (void)local; (void)utc;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value LockWorkStationBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    BOOL res = SafeLockWorkStation();
    return Napi::Number::New(env, res);
#else
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value DisconnectNamedPipeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) {
        Napi::TypeError::New(env, "hNamedPipe argument required").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = DisconnectNamedPipe(reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)));
    return Napi::Number::New(env, res);
#else
    (void)handleVal;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SHGetKnownFolderPathBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    Napi::Object obj = Napi::Object::New(env);
    if (info.Length() < 3) {
        obj.Set("hr", Napi::Number::New(env, static_cast<int32_t>(0x80070057)));
        obj.Set("path", Napi::Number::New(env, 0));
        return obj;
    }
    int64_t rfid = info[0].As<Napi::Number>().Int64Value();
    uint32_t dwFlags = info[1].As<Napi::Number>().Uint32Value();
    int64_t hToken = info[2].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (rfid == 0) {
        obj.Set("hr", Napi::Number::New(env, static_cast<int32_t>(0x80070057)));
        obj.Set("path", Napi::Number::New(env, 0));
        return obj;
    }
    PWSTR path = NULL;
    HRESULT hr = SafeSHGetKnownFolderPath(
        reinterpret_cast<const GUID*>(static_cast<intptr_t>(rfid)),
        dwFlags,
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(hToken)),
        &path
    );
    obj.Set("hr", Napi::Number::New(env, static_cast<int32_t>(hr)));
    obj.Set("path", Napi::Number::New(env, reinterpret_cast<intptr_t>(path)));
    return obj;
#else
    (void)rfid; (void)dwFlags; (void)hToken;
    obj.Set("hr", Napi::Number::New(env, static_cast<int32_t>(0x80004001)));
    obj.Set("path", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value CoTaskMemFreeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        int64_t pv = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
        SafeCoTaskMemFree(reinterpret_cast<LPVOID>(static_cast<intptr_t>(pv)));
#else
        (void)pv;
#endif
    }
    return env.Undefined();
}

Napi::Value LstrlenWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t str = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (str == 0) return Napi::Number::New(env, 0);
    int len = lstrlenW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(str)));
    return Napi::Number::New(env, len);
#else
    (void)str;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetUserPreferredUILanguagesBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    Napi::Object obj = Napi::Object::New(env);
    if (info.Length() < 4) {
        obj.Set("success", Napi::Number::New(env, 0));
        obj.Set("numLanguages", Napi::Number::New(env, 0));
        obj.Set("cchLanguagesBuffer", Napi::Number::New(env, 0));
        return obj;
    }
    uint32_t dwFlags = info[0].As<Napi::Number>().Uint32Value();
    uint32_t numLangsIn = info[1].As<Napi::Number>().Uint32Value();
    int64_t bufPtr = info[2].As<Napi::Number>().Int64Value();
    uint32_t cchBufIn = info[3].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    ULONG numLangs = numLangsIn;
    ULONG cchBuf = cchBufIn;
    BOOL res = SafeGetUserPreferredUILanguages(
        dwFlags,
        &numLangs,
        reinterpret_cast<LPWSTR>(static_cast<intptr_t>(bufPtr)),
        &cchBuf
    );
    obj.Set("success", Napi::Number::New(env, res));
    obj.Set("numLanguages", Napi::Number::New(env, static_cast<uint32_t>(numLangs)));
    obj.Set("cchLanguagesBuffer", Napi::Number::New(env, static_cast<uint32_t>(cchBuf)));
    return obj;
#else
    (void)dwFlags; (void)numLangsIn; (void)bufPtr; (void)cchBufIn;
    obj.Set("success", Napi::Number::New(env, 0));
    obj.Set("numLanguages", Napi::Number::New(env, 0));
    obj.Set("cchLanguagesBuffer", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value GetConsoleModeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    Napi::Object obj = Napi::Object::New(env);
    if (info.Length() < 1) {
        obj.Set("success", Napi::Number::New(env, 0));
        obj.Set("mode", Napi::Number::New(env, 0));
        return obj;
    }
    int64_t h = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD mode = 0;
    BOOL res = GetConsoleMode(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)), &mode);
    obj.Set("success", Napi::Number::New(env, res));
    obj.Set("mode", Napi::Number::New(env, static_cast<uint32_t>(mode)));
    return obj;
#else
    (void)h;
    obj.Set("success", Napi::Number::New(env, 0));
    obj.Set("mode", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value SetConsoleModeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    uint32_t mode = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = SetConsoleMode(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)), mode);
    return Napi::Number::New(env, res);
#else
    (void)h; (void)mode;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetStdHandleBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, -1);
    uint32_t stdHandle = info[0].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    HANDLE h = GetStdHandle(stdHandle);
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    (void)stdHandle;
    return Napi::Number::New(env, -1);
#endif
}

Napi::Value GetConsoleScreenBufferInfoBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    int64_t ptr = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (ptr == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = GetConsoleScreenBufferInfo(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)),
        reinterpret_cast<PCONSOLE_SCREEN_BUFFER_INFO>(static_cast<intptr_t>(ptr))
    );
    return Napi::Number::New(env, res);
#else
    (void)h; (void)ptr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SetConsoleTextAttributeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    uint32_t attr = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = SetConsoleTextAttribute(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)), static_cast<WORD>(attr));
    return Napi::Number::New(env, res);
#else
    (void)h; (void)attr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetConsoleCursorInfoBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    int64_t ptr = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (ptr == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = GetConsoleCursorInfo(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)),
        reinterpret_cast<PCONSOLE_CURSOR_INFO>(static_cast<intptr_t>(ptr))
    );
    return Napi::Number::New(env, res);
#else
    (void)h; (void)ptr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SetConsoleCursorInfoBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    int64_t ptr = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (ptr == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = SetConsoleCursorInfo(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)),
        reinterpret_cast<const CONSOLE_CURSOR_INFO*>(static_cast<intptr_t>(ptr))
    );
    return Napi::Number::New(env, res);
#else
    (void)h; (void)ptr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SetConsoleCursorPositionBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    int32_t x = info[1].As<Napi::Number>().Int32Value();
    int32_t y = info[2].As<Napi::Number>().Int32Value();
#if IS_WINDOWS
    COORD pos;
    pos.X = static_cast<SHORT>(x);
    pos.Y = static_cast<SHORT>(y);
    BOOL res = SetConsoleCursorPosition(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)), pos);
    return Napi::Number::New(env, res);
#else
    (void)h; (void)x; (void)y;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetNumberOfConsoleInputEventsBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    Napi::Object obj = Napi::Object::New(env);
    if (info.Length() < 1) {
        obj.Set("success", Napi::Number::New(env, 0));
        obj.Set("events", Napi::Number::New(env, 0));
        return obj;
    }
    int64_t h = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD events = 0;
    BOOL res = GetNumberOfConsoleInputEvents(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)), &events);
    obj.Set("success", Napi::Number::New(env, res));
    obj.Set("events", Napi::Number::New(env, static_cast<uint32_t>(events)));
    return obj;
#else
    (void)h;
    obj.Set("success", Napi::Number::New(env, 0));
    obj.Set("events", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value ReadConsoleInputWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    Napi::Object obj = Napi::Object::New(env);
    if (info.Length() < 3) {
        obj.Set("success", Napi::Number::New(env, 0));
        obj.Set("eventsRead", Napi::Number::New(env, 0));
        return obj;
    }
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    int64_t buf = info[1].As<Napi::Number>().Int64Value();
    uint32_t len = info[2].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    if (buf == 0) {
        SetLastError(87);
        obj.Set("success", Napi::Number::New(env, 0));
        obj.Set("eventsRead", Napi::Number::New(env, 0));
        return obj;
    }
    DWORD eventsRead = 0;
    BOOL res = ReadConsoleInputW(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)),
        reinterpret_cast<PINPUT_RECORD>(static_cast<intptr_t>(buf)),
        len,
        &eventsRead
    );
    obj.Set("success", Napi::Number::New(env, res));
    obj.Set("eventsRead", Napi::Number::New(env, static_cast<uint32_t>(eventsRead)));
    return obj;
#else
    (void)h; (void)buf; (void)len;
    obj.Set("success", Napi::Number::New(env, 0));
    obj.Set("eventsRead", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value LoadLibraryWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t name = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (name == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    HMODULE h = LoadLibraryW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(name)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    (void)name;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetProcAddressBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    int64_t name = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (name == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    FARPROC p = GetProcAddress(
        reinterpret_cast<HMODULE>(static_cast<intptr_t>(h)),
        reinterpret_cast<LPCSTR>(static_cast<intptr_t>(name))
    );
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(p));
#else
    (void)h; (void)name;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetModuleHandleWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t name = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    HMODULE h = GetModuleHandleW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(name)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    (void)name;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetFullPathNameWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    Napi::Object obj = Napi::Object::New(env);
    if (info.Length() < 3) {
        obj.Set("length", Napi::Number::New(env, 0));
        obj.Set("filePart", Napi::Number::New(env, 0));
        return obj;
    }
    int64_t fileName = info[0].As<Napi::Number>().Int64Value();
    uint32_t bufLen = info[1].As<Napi::Number>().Uint32Value();
    int64_t buf = info[2].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (fileName == 0) {
        SetLastError(87);
        obj.Set("length", Napi::Number::New(env, 0));
        obj.Set("filePart", Napi::Number::New(env, 0));
        return obj;
    }
    LPWSTR filePart = NULL;
    DWORD res = GetFullPathNameW(
        reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(fileName)),
        bufLen,
        reinterpret_cast<LPWSTR>(static_cast<intptr_t>(buf)),
        &filePart
    );
    obj.Set("length", Napi::Number::New(env, static_cast<uint32_t>(res)));
    obj.Set("filePart", Napi::Number::New(env, reinterpret_cast<intptr_t>(filePart)));
    return obj;
#else
    (void)fileName; (void)bufLen; (void)buf;
    obj.Set("length", Napi::Number::New(env, 0));
    obj.Set("filePart", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value GetFileInformationByHandleBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    int64_t ptr = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    if (ptr == 0) {
        SetLastError(87);
        return Napi::Number::New(env, 0);
    }
    BOOL res = GetFileInformationByHandle(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)),
        reinterpret_cast<LPBY_HANDLE_FILE_INFORMATION>(static_cast<intptr_t>(ptr))
    );
    return Napi::Number::New(env, res);
#else
    (void)h; (void)ptr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetFileTypeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD res = GetFileType(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)));
    return Napi::Number::New(env, static_cast<uint32_t>(res));
#else
    (void)h;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetComputerNameExWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    Napi::Object obj = Napi::Object::New(env);
    if (info.Length() < 3) {
        obj.Set("success", Napi::Number::New(env, 0));
        obj.Set("size", Napi::Number::New(env, 0));
        return obj;
    }
    int32_t nameType = info[0].As<Napi::Number>().Int32Value();
    int64_t buf = info[1].As<Napi::Number>().Int64Value();
    uint32_t sizeIn = info[2].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    DWORD sz = sizeIn;
    BOOL res = GetComputerNameExW(
        static_cast<COMPUTER_NAME_FORMAT>(nameType),
        reinterpret_cast<LPWSTR>(static_cast<intptr_t>(buf)),
        &sz
    );
    obj.Set("success", Napi::Number::New(env, res));
    obj.Set("size", Napi::Number::New(env, static_cast<uint32_t>(sz)));
    return obj;
#else
    (void)nameType; (void)buf; (void)sizeIn;
    obj.Set("success", Napi::Number::New(env, 0));
    obj.Set("size", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value IsNativeAvailableBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    return Napi::Boolean::New(env, IS_WINDOWS);
}

Napi::Object Init(Napi::Env env, Napi::Object exports) {
    // Foundation
    exports.Set("CloseHandle", Napi::Function::New(env, CloseHandleBinding));
    exports.Set("GetLastError", Napi::Function::New(env, GetLastErrorBinding));
    exports.Set("SetLastError", Napi::Function::New(env, SetLastErrorBinding));
    exports.Set("SetLastErrorEx", Napi::Function::New(env, SetLastErrorExBinding));
    exports.Set("LocalFree", Napi::Function::New(env, LocalFreeBinding));
    exports.Set("GlobalFree", Napi::Function::New(env, GlobalFreeBinding));
    exports.Set("FreeLibrary", Napi::Function::New(env, FreeLibraryBinding));
    exports.Set("SetHandleInformation", Napi::Function::New(env, SetHandleInformationBinding));
    exports.Set("GetHandleInformation", Napi::Function::New(env, GetHandleInformationBinding));
    exports.Set("CompareObjectHandles", Napi::Function::New(env, CompareObjectHandlesBinding));
    exports.Set("DuplicateHandle", Napi::Function::New(env, DuplicateHandleBinding));
    exports.Set("RtlNtStatusToDosError", Napi::Function::New(env, RtlNtStatusToDosErrorBinding));
    exports.Set("SysAllocString", Napi::Function::New(env, SysAllocStringBinding));
    exports.Set("SysAllocStringByteLen", Napi::Function::New(env, SysAllocStringByteLenBinding));
    exports.Set("SysAllocStringLen", Napi::Function::New(env, SysAllocStringLenBinding));
    exports.Set("SysFreeString", Napi::Function::New(env, SysFreeStringBinding));
    exports.Set("SysAddRefString", Napi::Function::New(env, SysAddRefStringBinding));
    exports.Set("SysReleaseString", Napi::Function::New(env, SysReleaseStringBinding));
    exports.Set("SysStringByteLen", Napi::Function::New(env, SysStringByteLenBinding));
    exports.Set("SysStringLen", Napi::Function::New(env, SysStringLenBinding));

    // Storage / FileSystem
    exports.Set("SetFileAttributesW", Napi::Function::New(env, SetFileAttributesWBinding));
    exports.Set("SetFileAttributesA", Napi::Function::New(env, SetFileAttributesABinding));
    exports.Set("GetFileAttributesW", Napi::Function::New(env, GetFileAttributesWBinding));
    exports.Set("GetFileAttributesA", Napi::Function::New(env, GetFileAttributesABinding));
    exports.Set("DeleteFileW", Napi::Function::New(env, DeleteFileWBinding));
    exports.Set("DeleteFileA", Napi::Function::New(env, DeleteFileABinding));
    exports.Set("FlushFileBuffers", Napi::Function::New(env, FlushFileBuffersBinding));
    exports.Set("AreFileApisANSI", Napi::Function::New(env, AreFileApisANSIBinding));
    exports.Set("GetFullPathNameW", Napi::Function::New(env, GetFullPathNameWBinding));
    exports.Set("GetFileInformationByHandle", Napi::Function::New(env, GetFileInformationByHandleBinding));
    exports.Set("GetFileType", Napi::Function::New(env, GetFileTypeBinding));

    // System / Threading
    exports.Set("GetCurrentProcess", Napi::Function::New(env, GetCurrentProcessBinding));
    exports.Set("GetCurrentProcessId", Napi::Function::New(env, GetCurrentProcessIdBinding));
    exports.Set("GetCurrentThread", Napi::Function::New(env, GetCurrentThreadBinding));
    exports.Set("GetCurrentThreadId", Napi::Function::New(env, GetCurrentThreadIdBinding));
    exports.Set("TerminateProcess", Napi::Function::New(env, TerminateProcessBinding));
    exports.Set("ExitProcess", Napi::Function::New(env, ExitProcessBinding));
    exports.Set("OpenProcess", Napi::Function::New(env, OpenProcessBinding));

    // System / ProcessStatus, Time, Shutdown, Pipes
    exports.Set("K32EmptyWorkingSet", Napi::Function::New(env, K32EmptyWorkingSetBinding));
    exports.Set("GetTimeZoneInformation", Napi::Function::New(env, GetTimeZoneInformationBinding));
    exports.Set("GetTimeZoneInformationForYear", Napi::Function::New(env, GetTimeZoneInformationForYearBinding));
    exports.Set("SystemTimeToFileTime", Napi::Function::New(env, SystemTimeToFileTimeBinding));
    exports.Set("SystemTimeToTzSpecificLocalTime", Napi::Function::New(env, SystemTimeToTzSpecificLocalTimeBinding));
    exports.Set("TzSpecificLocalTimeToSystemTime", Napi::Function::New(env, TzSpecificLocalTimeToSystemTimeBinding));
    exports.Set("LockWorkStation", Napi::Function::New(env, LockWorkStationBinding));
    exports.Set("DisconnectNamedPipe", Napi::Function::New(env, DisconnectNamedPipeBinding));

    // UI / Shell & System / Com
    exports.Set("SHGetKnownFolderPath", Napi::Function::New(env, SHGetKnownFolderPathBinding));
    exports.Set("CoTaskMemFree", Napi::Function::New(env, CoTaskMemFreeBinding));

    // Globalization
    exports.Set("lstrlenW", Napi::Function::New(env, LstrlenWBinding));
    exports.Set("GetUserPreferredUILanguages", Napi::Function::New(env, GetUserPreferredUILanguagesBinding));

    // System / Console
    exports.Set("GetConsoleMode", Napi::Function::New(env, GetConsoleModeBinding));
    exports.Set("SetConsoleMode", Napi::Function::New(env, SetConsoleModeBinding));
    exports.Set("GetStdHandle", Napi::Function::New(env, GetStdHandleBinding));
    exports.Set("GetConsoleScreenBufferInfo", Napi::Function::New(env, GetConsoleScreenBufferInfoBinding));
    exports.Set("SetConsoleTextAttribute", Napi::Function::New(env, SetConsoleTextAttributeBinding));
    exports.Set("GetConsoleCursorInfo", Napi::Function::New(env, GetConsoleCursorInfoBinding));
    exports.Set("SetConsoleCursorInfo", Napi::Function::New(env, SetConsoleCursorInfoBinding));
    exports.Set("SetConsoleCursorPosition", Napi::Function::New(env, SetConsoleCursorPositionBinding));
    exports.Set("GetNumberOfConsoleInputEvents", Napi::Function::New(env, GetNumberOfConsoleInputEventsBinding));
    exports.Set("ReadConsoleInputW", Napi::Function::New(env, ReadConsoleInputWBinding));

    // System / LibraryLoader
    exports.Set("LoadLibraryW", Napi::Function::New(env, LoadLibraryWBinding));
    exports.Set("GetProcAddress", Napi::Function::New(env, GetProcAddressBinding));
    exports.Set("GetModuleHandleW", Napi::Function::New(env, GetModuleHandleWBinding));

    // System / SystemInformation
    exports.Set("GetComputerNameExW", Napi::Function::New(env, GetComputerNameExWBinding));

    exports.Set("isNativeAvailable", Napi::Function::New(env, IsNativeAvailableBinding));
    return exports;
}

NODE_API_MODULE(windows_sys_native, Init)
