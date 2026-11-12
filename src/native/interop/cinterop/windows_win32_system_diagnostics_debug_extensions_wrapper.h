#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_DEBUG_EXTENSIONS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_DEBUG_EXTENSIONS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_DEBUG_EXTENSIONS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_DEBUG_EXTENSIONS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(void* debughost, void* manager);
int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(void* remoteoptions, void* interfaceid, void* arg2Interface);
int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(void* remoteoptions, void* interfaceid, void* arg2Interface);
int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(void* interfaceid, void* arg1Interface);
int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(void* interfaceid, uint32_t dbgengoptions, void* arg2Interface);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_DEBUG_EXTENSIONS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_DEBUG_EXTENSIONS_WRAPPER_H */
