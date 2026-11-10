#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_com_marshal_bstrUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_bstrUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_bstrUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_bstrUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_bstrUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_bstrUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_clipformatUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_clipformatUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_clipformatUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_clipformatUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_clipformatUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_clipformatUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal64(void* param0, void* param1, void* param2);
int32_t windowssys_windows_win32_system_com_marshal_coGetMarshalSizeMax(void* pulsize, void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags);
int32_t windowssys_windows_win32_system_com_marshal_coGetStandardMarshal(void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags, void* ppmarshal);
int32_t windowssys_windows_win32_system_com_marshal_coGetStdMarshalEx(void* punkouter, uint32_t smexflags, void* ppunkinner);
int32_t windowssys_windows_win32_system_com_marshal_coMarshalHresult(void* pstm, int32_t hresult);
int32_t windowssys_windows_win32_system_com_marshal_coMarshalInterThreadInterfaceInStream(void* riid, void* punk, void* ppstm);
int32_t windowssys_windows_win32_system_com_marshal_coMarshalInterface(void* pstm, void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags);
int32_t windowssys_windows_win32_system_com_marshal_coReleaseMarshalData(void* pstm);
int32_t windowssys_windows_win32_system_com_marshal_coUnmarshalHresult(void* pstm, void* phresult);
int32_t windowssys_windows_win32_system_com_marshal_coUnmarshalInterface(void* pstm, void* riid, void* ppv);
void windowssys_windows_win32_system_com_marshal_haccelUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_haccelUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_haccelUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_haccelUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_haccelUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_haccelUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_hbitmapUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_hbitmapUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hbitmapUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hbitmapUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_hdcUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_hdcUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_hdcUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hdcUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hdcUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hdcUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_hglobalUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_hglobalUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_hglobalUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hglobalUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hglobalUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hglobalUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_hiconUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_hiconUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_hiconUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hiconUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hiconUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hiconUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_hmenuUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_hmenuUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_hmenuUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hmenuUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hmenuUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hmenuUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_hpaletteUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_hpaletteUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hpaletteUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hpaletteUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_hwndUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_hwndUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_hwndUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hwndUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hwndUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_hwndUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_snbUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_snbUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_snbUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_snbUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_snbUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_snbUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_snbUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_snbUserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_stgmediumUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_stgmediumUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_stgmediumUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_stgmediumUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal64(void* param0, void* param1, void* param2);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H */
