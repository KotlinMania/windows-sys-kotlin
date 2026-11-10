#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider(void* hprovider);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket(void* hprovider, uint32_t cbdevmode, void* pdevmode, int32_t scope, void* pprintticket);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode(void* hprovider, void* pprintticket, int32_t basedevmodetype, int32_t scope, void* pcbdevmode, void* ppdevmode, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities(void* hprovider, void* pprintticket, void* pcapabilities, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities(void* hprovider, void* pprintticket, void* pdevicecapabilities, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources(void* hprovider, void* pszlocalename, void* pprintticket, void* pdeviceresources, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket(void* hprovider, void* pbaseticket, void* pdeltaticket, int32_t scope, void* presultticket, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider(void* pszprintername, uint32_t dwversion, void* phprovider);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx(void* pszprintername, uint32_t dwmaxversion, uint32_t dwprefversion, void* phprovider, void* pusedversion);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport(void* pszprintername, void* pmaxversion);
int32_t windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory(void* pbuffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WRAPPER_H */
