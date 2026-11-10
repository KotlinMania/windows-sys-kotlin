#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_media_dxmediaobjects_dMOEnum(void* guidcategory, uint32_t dwflags, uint32_t cintypes, void* pintypes, uint32_t couttypes, void* pouttypes, void* ppenum);
int32_t windowssys_windows_win32_media_dxmediaobjects_dMOGetName(void* clsiddmo, void* szname);
int32_t windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes(void* clsiddmo, uint32_t ulinputtypesrequested, void* pulinputtypessupplied, void* pinputtypes, uint32_t uloutputtypesrequested, void* puloutputtypessupplied, void* poutputtypes);
int32_t windowssys_windows_win32_media_dxmediaobjects_dMORegister(void* szname, void* clsiddmo, void* guidcategory, uint32_t dwflags, uint32_t cintypes, void* pintypes, uint32_t couttypes, void* pouttypes);
int32_t windowssys_windows_win32_media_dxmediaobjects_dMOUnregister(void* clsiddmo, void* guidcategory);
int32_t windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType(void* pmtdest, void* pmtsrc);
int32_t windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType(void* ppmt, uint32_t cbformat);
int32_t windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType(void* pmt);
int32_t windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType(void* ppmtdest, void* pmtsrc);
int32_t windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType(void* pmt);
int32_t windowssys_windows_win32_media_dxmediaobjects_moInitMediaType(void* pmt, uint32_t cbformat);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WRAPPER_H */
