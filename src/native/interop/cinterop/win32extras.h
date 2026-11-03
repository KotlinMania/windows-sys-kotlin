#ifndef WIN32EXTRAS_H
#define WIN32EXTRAS_H

/* Include windows.h first so that _mingw.h defines EXTERN_C, the base
   Win32 types (HANDLE, BSTR, PCWSTR, PCSTR, etc.), and the Win32
   calling-convention macros before any of the declarations below.
   Without this, oleauto.h fails with "unknown type name 'EXTERN_C'"
   when the cinterop indexer processes it. */
#include <windows.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Functions from oleaut32.dll (oleauto.h) — present in the Windows SDK
   but not exposed by the MinGW-w64 platform.windows cinterop that
   Kotlin/Native ships.  Declared here so cinterop generates Kotlin
   bindings for them. */
DECLSPEC_IMPORT BSTR __stdcall SysAllocString(const OLECHAR *psz);
DECLSPEC_IMPORT BSTR __stdcall SysAllocStringByteLen(LPCSTR psz, UINT len);
DECLSPEC_IMPORT BSTR __stdcall SysAllocStringLen(const OLECHAR *strIn, UINT ui);
DECLSPEC_IMPORT void __stdcall SysFreeString(BSTR bstrString);
DECLSPEC_IMPORT int __stdcall SysReAllocString(BSTR *pbstr, const OLECHAR *psz);
DECLSPEC_IMPORT int __stdcall SysReAllocStringLen(BSTR *pbstr, const OLECHAR *psz, UINT len);
DECLSPEC_IMPORT HRESULT __stdcall SysAddRefString(BSTR bstrString);
DECLSPEC_IMPORT void __stdcall SysReleaseString(BSTR bstrString);
DECLSPEC_IMPORT UINT __stdcall SysStringByteLen(BSTR bstr);
DECLSPEC_IMPORT UINT __stdcall SysStringLen(BSTR pbstr);

/* Function from ntdll.dll (winternl.h) — not in platform.windows. */
DECLSPEC_IMPORT ULONG __stdcall RtlNtStatusToDosError(NTSTATUS status);

/* Function from api-ms-win-core-handle-l1-1-0.dll — not in the
   MinGW-w64 headers shipped with Kotlin/Native. */
DECLSPEC_IMPORT BOOL __stdcall CompareObjectHandles(HANDLE hFirstObjectHandle, HANDLE hSecondObjectHandle);

/* Function from user32.dll — not in platform.windows cinterop. */
DECLSPEC_IMPORT void __stdcall SetLastErrorEx(DWORD dwErrCode, DWORD dwType);
DECLSPEC_IMPORT BOOL __stdcall LockWorkStation(void);

/* Function from psapi.dll / kernel32.dll */
DECLSPEC_IMPORT BOOL __stdcall K32EmptyWorkingSet(HANDLE hProcess);

/* Function from shell32.dll (shlobj.h) */
DECLSPEC_IMPORT HRESULT __stdcall SHGetKnownFolderPath(const GUID *rfid, DWORD dwFlags, HANDLE hToken, PWSTR *ppszPath);

/* Function from ole32.dll / combase.dll (combaseapi.h) */
DECLSPEC_IMPORT void __stdcall CoTaskMemFree(LPVOID pv);

/* Function from kernel32.dll (winnls.h) */
DECLSPEC_IMPORT BOOL __stdcall GetUserPreferredUILanguages(DWORD dwFlags, PULONG pulNumLanguages, LPWSTR pwszLanguagesBuffer, PULONG pcchLanguagesBuffer);

/* Function from kernel32.dll (timezoneapi.h) */
BOOL __stdcall GetTimeZoneInformationForYear(USHORT wYear, PDYNAMIC_TIME_ZONE_INFORMATION pdtzi, LPTIME_ZONE_INFORMATION ptzi);

#ifdef __cplusplus
}
#endif

#endif /* WIN32EXTRAS_H */