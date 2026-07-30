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
BSTR __stdcall SysAllocString(const OLECHAR *psz);
BSTR __stdcall SysAllocStringByteLen(LPCSTR psz, UINT len);
BSTR __stdcall SysAllocStringLen(const OLECHAR *strIn, UINT ui);
void __stdcall SysFreeString(BSTR bstrString);
int __stdcall SysReAllocString(BSTR *pbstr, const OLECHAR *psz);
int __stdcall SysReAllocStringLen(BSTR *pbstr, const OLECHAR *psz, UINT len);
int __stdcall SysAddRefString(BSTR bstrString);
void __stdcall SysReleaseString(BSTR bstrString);
UINT __stdcall SysStringByteLen(BSTR bstr);
UINT __stdcall SysStringLen(BSTR pbstr);

/* Function from ntdll.dll (winternl.h) — not in platform.windows. */
ULONG __stdcall RtlNtStatusToDosError(NTSTATUS status);

/* Function from api-ms-win-core-handle-l1-1-0.dll — not in the
   MinGW-w64 headers shipped with Kotlin/Native. */
BOOL __stdcall CompareObjectHandles(HANDLE hFirstObjectHandle, HANDLE hSecondObjectHandle);

/* Function from user32.dll — not in platform.windows cinterop. */
void __stdcall SetLastErrorEx(DWORD dwErrCode, DWORD dwType);

#ifdef __cplusplus
}
#endif

#endif /* WIN32EXTRAS_H */