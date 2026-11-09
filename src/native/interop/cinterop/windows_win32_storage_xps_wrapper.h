#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_storage_xps_AbortDoc(void* hdc);
int32_t windowssys_windows_win32_storage_xps_DeviceCapabilitiesA(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode);
int32_t windowssys_windows_win32_storage_xps_DeviceCapabilitiesW(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode);
int32_t windowssys_windows_win32_storage_xps_EndDoc(void* hdc);
int32_t windowssys_windows_win32_storage_xps_EndPage(void* hdc);
int32_t windowssys_windows_win32_storage_xps_Escape(void* hdc, int32_t iescape, int32_t cjin, void* pvin, void* pvout);
int32_t windowssys_windows_win32_storage_xps_ExtEscape(void* hdc, int32_t iescape, int32_t cjinput, void* lpindata, int32_t cjoutput, void* lpoutdata);
int32_t windowssys_windows_win32_storage_xps_PrintWindow(void* hwnd, void* hdcblt, uint32_t nflags);
int32_t windowssys_windows_win32_storage_xps_SetAbortProc(void* hdc, void* proc);
int32_t windowssys_windows_win32_storage_xps_StartDocA(void* hdc, void* lpdi);
int32_t windowssys_windows_win32_storage_xps_StartDocW(void* hdc, void* lpdi);
int32_t windowssys_windows_win32_storage_xps_StartPage(void* hdc);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_XPS_WINDOWS_WIN32_STORAGE_XPS_WRAPPER_H */
