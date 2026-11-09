#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_graphics_printing_printticket_PTCloseProvider(void* hprovider);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTConvertDevModeToPrintTicket(void* hprovider, uint32_t cbdevmode, void* pdevmode, int32_t scope, void* pprintticket);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTConvertPrintTicketToDevMode(void* hprovider, void* pprintticket, int32_t basedevmodetype, int32_t scope, void* pcbdevmode, void* ppdevmode, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTGetPrintCapabilities(void* hprovider, void* pprintticket, void* pcapabilities, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceCapabilities(void* hprovider, void* pprintticket, void* pdevicecapabilities, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceResources(void* hprovider, void* pszlocalename, void* pprintticket, void* pdeviceresources, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTMergeAndValidatePrintTicket(void* hprovider, void* pbaseticket, void* pdeltaticket, int32_t scope, void* presultticket, void* pbstrerrormessage);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTOpenProvider(void* pszprintername, uint32_t dwversion, void* phprovider);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTOpenProviderEx(void* pszprintername, uint32_t dwmaxversion, uint32_t dwprefversion, void* phprovider, void* pusedversion);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTQuerySchemaVersionSupport(void* pszprintername, void* pmaxversion);
int32_t windowssys_windows_win32_graphics_printing_printticket_PTReleaseMemory(void* pbuffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WINDOWS_WIN32_GRAPHICS_PRINTING_PRINTTICKET_WRAPPER_H */
