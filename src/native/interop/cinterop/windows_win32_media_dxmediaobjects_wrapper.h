#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(void* guidcategory, uint32_t dwflags, uint32_t cintypes, void* pintypes, uint32_t couttypes, void* pouttypes, void* ppenum);
int32_t windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(void* clsiddmo, void* szname);
int32_t windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(void* clsiddmo, uint32_t ulinputtypesrequested, void* pulinputtypessupplied, void* pinputtypes, uint32_t uloutputtypesrequested, void* puloutputtypessupplied, void* poutputtypes);
int32_t windowssysWindowsWin32MediaDxmediaobjectsDMORegister(void* szname, void* clsiddmo, void* guidcategory, uint32_t dwflags, uint32_t cintypes, void* pintypes, uint32_t couttypes, void* pouttypes);
int32_t windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(void* clsiddmo, void* guidcategory);
int32_t windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(void* pmtdest, void* pmtsrc);
int32_t windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(void* ppmt, uint32_t cbformat);
int32_t windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(void* pmt);
int32_t windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(void* ppmtdest, void* pmtsrc);
int32_t windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(void* pmt);
int32_t windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(void* pmt, uint32_t cbformat);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WINDOWS_WIN32_MEDIA_DXMEDIAOBJECTS_WRAPPER_H */
