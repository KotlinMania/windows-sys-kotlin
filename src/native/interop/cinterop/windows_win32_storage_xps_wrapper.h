#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_storage_xps_abortDoc(void* hdc);
int32_t windowssys_windows_win32_storage_xps_deviceCapabilitiesA(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode);
int32_t windowssys_windows_win32_storage_xps_deviceCapabilitiesW(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode);
int32_t windowssys_windows_win32_storage_xps_endDoc(void* hdc);
int32_t windowssys_windows_win32_storage_xps_endPage(void* hdc);
int32_t windowssys_windows_win32_storage_xps_escape(void* hdc, int32_t iescape, int32_t cjin, void* pvin, void* pvout);
int32_t windowssys_windows_win32_storage_xps_extEscape(void* hdc, int32_t iescape, int32_t cjinput, void* lpindata, int32_t cjoutput, void* lpoutdata);
int32_t windowssys_windows_win32_storage_xps_printWindow(void* hwnd, void* hdcblt, uint32_t nflags);
int32_t windowssys_windows_win32_storage_xps_setAbortProc(void* hdc, void* proc);
int32_t windowssys_windows_win32_storage_xps_startDocA(void* hdc, void* lpdi);
int32_t windowssys_windows_win32_storage_xps_startDocW(void* hdc, void* lpdi);
int32_t windowssys_windows_win32_storage_xps_startPage(void* hdc);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H */
