#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32SystemComMarshalBstrUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalBstrUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalBstrUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalBstrUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalBstrUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalBstrUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalClipformatUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalClipformatUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalClipformatUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalClipformatUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalClipformatUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(void* param0, void* param1, void* param2);
int32_t windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(void* pulsize, void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags);
int32_t windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags, void* ppmarshal);
int32_t windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(void* punkouter, uint32_t smexflags, void* ppunkinner);
int32_t windowssysWindowsWin32SystemComMarshalCoMarshalHresult(void* pstm, int32_t hresult);
int32_t windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(void* riid, void* punk, void* ppstm);
int32_t windowssysWindowsWin32SystemComMarshalCoMarshalInterface(void* pstm, void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags);
int32_t windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(void* pstm);
int32_t windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(void* pstm, void* phresult);
int32_t windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(void* pstm, void* riid, void* ppv);
void windowssysWindowsWin32SystemComMarshalHaccelUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHaccelUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHaccelUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHaccelUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHaccelUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalHbitmapUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHbitmapUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHbitmapUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHbitmapUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalHdcUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHdcUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHdcUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHdcUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHdcUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHdcUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalHglobalUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHglobalUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHglobalUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHglobalUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHglobalUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalHiconUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHiconUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHiconUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHiconUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHiconUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHiconUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalHmenuUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHmenuUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHmenuUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHmenuUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHmenuUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalHpaletteUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHpaletteUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHpaletteUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHpaletteUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalHwndUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalHwndUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalHwndUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHwndUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHwndUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalHwndUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalSnbUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalSnbUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalSnbUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalSnbUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalSnbUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalSnbUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssysWindowsWin32SystemComMarshalStgmediumUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemComMarshalStgmediumUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalStgmediumUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemComMarshalStgmediumUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(void* param0, void* param1, void* param2);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H */
