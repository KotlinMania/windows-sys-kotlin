#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32StorageXpsAbortDoc(void* hdc);
int32_t windowssysWindowsWin32StorageXpsDeviceCapabilitiesA(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode);
int32_t windowssysWindowsWin32StorageXpsDeviceCapabilitiesW(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode);
int32_t windowssysWindowsWin32StorageXpsEndDoc(void* hdc);
int32_t windowssysWindowsWin32StorageXpsEndPage(void* hdc);
int32_t windowssysWindowsWin32StorageXpsEscape(void* hdc, int32_t iescape, int32_t cjin, void* pvin, void* pvout);
int32_t windowssysWindowsWin32StorageXpsExtEscape(void* hdc, int32_t iescape, int32_t cjinput, void* lpindata, int32_t cjoutput, void* lpoutdata);
int32_t windowssysWindowsWin32StorageXpsPrintWindow(void* hwnd, void* hdcblt, uint32_t nflags);
int32_t windowssysWindowsWin32StorageXpsSetAbortProc(void* hdc, void* proc);
int32_t windowssysWindowsWin32StorageXpsStartDocA(void* hdc, void* lpdi);
int32_t windowssysWindowsWin32StorageXpsStartDocW(void* hdc, void* lpdi);
int32_t windowssysWindowsWin32StorageXpsStartPage(void* hdc);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H */
