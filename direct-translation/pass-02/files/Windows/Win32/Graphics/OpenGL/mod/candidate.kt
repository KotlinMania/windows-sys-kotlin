// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn ChoosePixelFormat(hdc : super::Gdi:: HDC, ppfd : *const PIXELFORMATDESCRIPTOR) -> i32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn DescribePixelFormat(hdc : super::Gdi:: HDC, ipixelformat : i32, nbytes : u32, ppfd : *mut PIXELFORMATDESCRIPTOR) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFilePixelFormat(hemf : super::Gdi:: HENHMETAFILE, cbbuffer : u32, ppfd : *mut PIXELFORMATDESCRIPTOR) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetPixelFormat(hdc : super::Gdi:: HDC) -> i32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SetPixelFormat(hdc : super::Gdi:: HDC, format : i32, ppfd : *const PIXELFORMATDESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SwapBuffers(param0 : super::Gdi:: HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glAccum(op : u32, value : f32));

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glAlphaFunc(func : u32, r#ref : f32));

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glAreTexturesResident(n : i32, textures : *const u32, residences : *mut u8) -> u8);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glArrayElement(i : i32));

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glBegin(mode : u32));

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glBindTexture(target : u32, texture : u32));

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glBitmap(width : i32, height : i32, xorig : f32, yorig : f32, xmove : f32, ymove : f32, bitmap : *const u8));

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glBlendFunc(sfactor : u32, dfactor : u32));

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCallList(list : u32));

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCallLists(n : i32, r#type : u32, lists : *const core::ffi::c_void));

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glClear(mask : u32));

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glClearAccum(red : f32, green : f32, blue : f32, alpha : f32));

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glClearColor(red : f32, green : f32, blue : f32, alpha : f32));

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glClearDepth(depth : f64));

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glClearIndex(c : f32));

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glClearStencil(s : i32));

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glClipPlane(plane : u32, equation : *const f64));

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3b(red : i8, green : i8, blue : i8));

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3bv(v : *const i8));

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3d(red : f64, green : f64, blue : f64));

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3dv(v : *const f64));

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3f(red : f32, green : f32, blue : f32));

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3fv(v : *const f32));

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3i(red : i32, green : i32, blue : i32));

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3iv(v : *const i32));

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3s(red : i16, green : i16, blue : i16));

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3sv(v : *const i16));

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3ub(red : u8, green : u8, blue : u8));

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3ubv(v : *const u8));

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3ui(red : u32, green : u32, blue : u32));

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3uiv(v : *const u32));

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3us(red : u16, green : u16, blue : u16));

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor3usv(v : *const u16));

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4b(red : i8, green : i8, blue : i8, alpha : i8));

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4bv(v : *const i8));

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4d(red : f64, green : f64, blue : f64, alpha : f64));

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4dv(v : *const f64));

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4f(red : f32, green : f32, blue : f32, alpha : f32));

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4fv(v : *const f32));

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4i(red : i32, green : i32, blue : i32, alpha : i32));

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4iv(v : *const i32));

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4s(red : i16, green : i16, blue : i16, alpha : i16));

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4sv(v : *const i16));

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4ub(red : u8, green : u8, blue : u8, alpha : u8));

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4ubv(v : *const u8));

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4ui(red : u32, green : u32, blue : u32, alpha : u32));

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4uiv(v : *const u32));

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4us(red : u16, green : u16, blue : u16, alpha : u16));

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColor4usv(v : *const u16));

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColorMask(red : u8, green : u8, blue : u8, alpha : u8));

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColorMaterial(face : u32, mode : u32));

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glColorPointer(size : i32, r#type : u32, stride : i32, pointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCopyPixels(x : i32, y : i32, width : i32, height : i32, r#type : u32));

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCopyTexImage1D(target : u32, level : i32, internalformat : u32, x : i32, y : i32, width : i32, border : i32));

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCopyTexImage2D(target : u32, level : i32, internalformat : u32, x : i32, y : i32, width : i32, height : i32, border : i32));

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCopyTexSubImage1D(target : u32, level : i32, xoffset : i32, x : i32, y : i32, width : i32));

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCopyTexSubImage2D(target : u32, level : i32, xoffset : i32, yoffset : i32, x : i32, y : i32, width : i32, height : i32));

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glCullFace(mode : u32));

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDeleteLists(list : u32, range : i32));

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDeleteTextures(n : i32, textures : *const u32));

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDepthFunc(func : u32));

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDepthMask(flag : u8));

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDepthRange(znear : f64, zfar : f64));

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDisable(cap : u32));

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDisableClientState(array : u32));

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDrawArrays(mode : u32, first : i32, count : i32));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDrawBuffer(mode : u32));

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDrawElements(mode : u32, count : i32, r#type : u32, indices : *const core::ffi::c_void));

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glDrawPixels(width : i32, height : i32, format : u32, r#type : u32, pixels : *const core::ffi::c_void));

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEdgeFlag(flag : u8));

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEdgeFlagPointer(stride : i32, pointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEdgeFlagv(flag : *const u8));

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEnable(cap : u32));

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEnableClientState(array : u32));

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEnd());

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEndList());

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord1d(u : f64));

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord1dv(u : *const f64));

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord1f(u : f32));

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord1fv(u : *const f32));

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord2d(u : f64, v : f64));

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord2dv(u : *const f64));

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord2f(u : f32, v : f32));

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalCoord2fv(u : *const f32));

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalMesh1(mode : u32, i1 : i32, i2 : i32));

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalMesh2(mode : u32, i1 : i32, i2 : i32, j1 : i32, j2 : i32));

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalPoint1(i : i32));

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glEvalPoint2(i : i32, j : i32));

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFeedbackBuffer(size : i32, r#type : u32, buffer : *mut f32));

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFinish());

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFlush());

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFogf(pname : u32, param1 : f32));

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFogfv(pname : u32, params : *const f32));

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFogi(pname : u32, param1 : i32));

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFogiv(pname : u32, params : *const i32));

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFrontFace(mode : u32));

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glFrustum(left : f64, right : f64, bottom : f64, top : f64, znear : f64, zfar : f64));

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGenLists(range : i32) -> u32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGenTextures(n : i32, textures : *mut u32));

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetBooleanv(pname : u32, params : *mut u8));

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetClipPlane(plane : u32, equation : *mut f64));

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetDoublev(pname : u32, params : *mut f64));

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetError() -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetFloatv(pname : u32, params : *mut f32));

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetIntegerv(pname : u32, params : *mut i32));

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetLightfv(light : u32, pname : u32, params : *mut f32));

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetLightiv(light : u32, pname : u32, params : *mut i32));

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetMapdv(target : u32, query : u32, v : *mut f64));

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetMapfv(target : u32, query : u32, v : *mut f32));

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetMapiv(target : u32, query : u32, v : *mut i32));

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetMaterialfv(face : u32, pname : u32, params : *mut f32));

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetMaterialiv(face : u32, pname : u32, params : *mut i32));

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetPixelMapfv(map : u32, values : *mut f32));

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetPixelMapuiv(map : u32, values : *mut u32));

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetPixelMapusv(map : u32, values : *mut u16));

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetPointerv(pname : u32, params : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetPolygonStipple(mask : *mut u8));

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetString(name : u32) -> *mut u8);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexEnvfv(target : u32, pname : u32, params : *mut f32));

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexEnviv(target : u32, pname : u32, params : *mut i32));

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexGendv(coord : u32, pname : u32, params : *mut f64));

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexGenfv(coord : u32, pname : u32, params : *mut f32));

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexGeniv(coord : u32, pname : u32, params : *mut i32));

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexImage(target : u32, level : i32, format : u32, r#type : u32, pixels : *mut core::ffi::c_void));

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexLevelParameterfv(target : u32, level : i32, pname : u32, params : *mut f32));

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexLevelParameteriv(target : u32, level : i32, pname : u32, params : *mut i32));

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexParameterfv(target : u32, pname : u32, params : *mut f32));

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glGetTexParameteriv(target : u32, pname : u32, params : *mut i32));

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glHint(target : u32, mode : u32));

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexMask(mask : u32));

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexPointer(r#type : u32, stride : i32, pointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexd(c : f64));

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexdv(c : *const f64));

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexf(c : f32));

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexfv(c : *const f32));

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexi(c : i32));

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexiv(c : *const i32));

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexs(c : i16));

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexsv(c : *const i16));

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexub(c : u8));

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIndexubv(c : *const u8));

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glInitNames());

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glInterleavedArrays(format : u32, stride : i32, pointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIsEnabled(cap : u32) -> u8);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIsList(list : u32) -> u8);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glIsTexture(texture : u32) -> u8);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLightModelf(pname : u32, param1 : f32));

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLightModelfv(pname : u32, params : *const f32));

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLightModeli(pname : u32, param1 : i32));

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLightModeliv(pname : u32, params : *const i32));

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLightf(light : u32, pname : u32, param2 : f32));

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLightfv(light : u32, pname : u32, params : *const f32));

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLighti(light : u32, pname : u32, param2 : i32));

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLightiv(light : u32, pname : u32, params : *const i32));

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLineStipple(factor : i32, pattern : u16));

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLineWidth(width : f32));

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glListBase(base : u32));

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLoadIdentity());

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLoadMatrixd(m : *const f64));

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLoadMatrixf(m : *const f32));

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLoadName(name : u32));

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glLogicOp(opcode : u32));

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMap1d(target : u32, u1 : f64, u2 : f64, stride : i32, order : i32, points : *const f64));

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMap1f(target : u32, u1 : f32, u2 : f32, stride : i32, order : i32, points : *const f32));

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMap2d(target : u32, u1 : f64, u2 : f64, ustride : i32, uorder : i32, v1 : f64, v2 : f64, vstride : i32, vorder : i32, points : *const f64));

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMap2f(target : u32, u1 : f32, u2 : f32, ustride : i32, uorder : i32, v1 : f32, v2 : f32, vstride : i32, vorder : i32, points : *const f32));

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMapGrid1d(un : i32, u1 : f64, u2 : f64));

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMapGrid1f(un : i32, u1 : f32, u2 : f32));

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMapGrid2d(un : i32, u1 : f64, u2 : f64, vn : i32, v1 : f64, v2 : f64));

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMapGrid2f(un : i32, u1 : f32, u2 : f32, vn : i32, v1 : f32, v2 : f32));

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMaterialf(face : u32, pname : u32, param2 : f32));

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMaterialfv(face : u32, pname : u32, params : *const f32));

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMateriali(face : u32, pname : u32, param2 : i32));

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMaterialiv(face : u32, pname : u32, params : *const i32));

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMatrixMode(mode : u32));

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMultMatrixd(m : *const f64));

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glMultMatrixf(m : *const f32));

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNewList(list : u32, mode : u32));

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3b(nx : i8, ny : i8, nz : i8));

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3bv(v : *const i8));

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3d(nx : f64, ny : f64, nz : f64));

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3dv(v : *const f64));

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3f(nx : f32, ny : f32, nz : f32));

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3fv(v : *const f32));

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3i(nx : i32, ny : i32, nz : i32));

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3iv(v : *const i32));

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3s(nx : i16, ny : i16, nz : i16));

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormal3sv(v : *const i16));

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glNormalPointer(r#type : u32, stride : i32, pointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glOrtho(left : f64, right : f64, bottom : f64, top : f64, znear : f64, zfar : f64));

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPassThrough(token : f32));

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelMapfv(map : u32, mapsize : i32, values : *const f32));

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelMapuiv(map : u32, mapsize : i32, values : *const u32));

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelMapusv(map : u32, mapsize : i32, values : *const u16));

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelStoref(pname : u32, param1 : f32));

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelStorei(pname : u32, param1 : i32));

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelTransferf(pname : u32, param1 : f32));

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelTransferi(pname : u32, param1 : i32));

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPixelZoom(xfactor : f32, yfactor : f32));

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPointSize(size : f32));

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPolygonMode(face : u32, mode : u32));

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPolygonOffset(factor : f32, units : f32));

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPolygonStipple(mask : *const u8));

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPopAttrib());

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPopClientAttrib());

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPopMatrix());

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPopName());

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPrioritizeTextures(n : i32, textures : *const u32, priorities : *const f32));

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPushAttrib(mask : u32));

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPushClientAttrib(mask : u32));

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPushMatrix());

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glPushName(name : u32));

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2d(x : f64, y : f64));

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2dv(v : *const f64));

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2f(x : f32, y : f32));

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2fv(v : *const f32));

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2i(x : i32, y : i32));

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2iv(v : *const i32));

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2s(x : i16, y : i16));

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos2sv(v : *const i16));

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3d(x : f64, y : f64, z : f64));

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3dv(v : *const f64));

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3f(x : f32, y : f32, z : f32));

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3fv(v : *const f32));

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3i(x : i32, y : i32, z : i32));

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3iv(v : *const i32));

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3s(x : i16, y : i16, z : i16));

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos3sv(v : *const i16));

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4d(x : f64, y : f64, z : f64, w : f64));

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4dv(v : *const f64));

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4f(x : f32, y : f32, z : f32, w : f32));

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4fv(v : *const f32));

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4i(x : i32, y : i32, z : i32, w : i32));

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4iv(v : *const i32));

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4s(x : i16, y : i16, z : i16, w : i16));

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRasterPos4sv(v : *const i16));

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glReadBuffer(mode : u32));

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glReadPixels(x : i32, y : i32, width : i32, height : i32, format : u32, r#type : u32, pixels : *mut core::ffi::c_void));

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRectd(x1 : f64, y1 : f64, x2 : f64, y2 : f64));

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRectdv(v1 : *const f64, v2 : *const f64));

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRectf(x1 : f32, y1 : f32, x2 : f32, y2 : f32));

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRectfv(v1 : *const f32, v2 : *const f32));

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRecti(x1 : i32, y1 : i32, x2 : i32, y2 : i32));

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRectiv(v1 : *const i32, v2 : *const i32));

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRects(x1 : i16, y1 : i16, x2 : i16, y2 : i16));

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRectsv(v1 : *const i16, v2 : *const i16));

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRenderMode(mode : u32) -> i32);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRotated(angle : f64, x : f64, y : f64, z : f64));

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glRotatef(angle : f32, x : f32, y : f32, z : f32));

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glScaled(x : f64, y : f64, z : f64));

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glScalef(x : f32, y : f32, z : f32));

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glScissor(x : i32, y : i32, width : i32, height : i32));

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glSelectBuffer(size : i32, buffer : *mut u32));

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glShadeModel(mode : u32));

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glStencilFunc(func : u32, r#ref : i32, mask : u32));

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glStencilMask(mask : u32));

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glStencilOp(fail : u32, zfail : u32, zpass : u32));

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1d(s : f64));

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1dv(v : *const f64));

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1f(s : f32));

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1fv(v : *const f32));

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1i(s : i32));

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1iv(v : *const i32));

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1s(s : i16));

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord1sv(v : *const i16));

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2d(s : f64, t : f64));

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2dv(v : *const f64));

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2f(s : f32, t : f32));

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2fv(v : *const f32));

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2i(s : i32, t : i32));

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2iv(v : *const i32));

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2s(s : i16, t : i16));

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord2sv(v : *const i16));

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3d(s : f64, t : f64, r : f64));

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3dv(v : *const f64));

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3f(s : f32, t : f32, r : f32));

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3fv(v : *const f32));

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3i(s : i32, t : i32, r : i32));

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3iv(v : *const i32));

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3s(s : i16, t : i16, r : i16));

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord3sv(v : *const i16));

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4d(s : f64, t : f64, r : f64, q : f64));

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4dv(v : *const f64));

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4f(s : f32, t : f32, r : f32, q : f32));

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4fv(v : *const f32));

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4i(s : i32, t : i32, r : i32, q : i32));

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4iv(v : *const i32));

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4s(s : i16, t : i16, r : i16, q : i16));

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoord4sv(v : *const i16));

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexCoordPointer(size : i32, r#type : u32, stride : i32, pointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexEnvf(target : u32, pname : u32, param2 : f32));

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexEnvfv(target : u32, pname : u32, params : *const f32));

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexEnvi(target : u32, pname : u32, param2 : i32));

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexEnviv(target : u32, pname : u32, params : *const i32));

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexGend(coord : u32, pname : u32, param2 : f64));

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexGendv(coord : u32, pname : u32, params : *const f64));

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexGenf(coord : u32, pname : u32, param2 : f32));

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexGenfv(coord : u32, pname : u32, params : *const f32));

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexGeni(coord : u32, pname : u32, param2 : i32));

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexGeniv(coord : u32, pname : u32, params : *const i32));

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexImage1D(target : u32, level : i32, internalformat : i32, width : i32, border : i32, format : u32, r#type : u32, pixels : *const core::ffi::c_void));

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexImage2D(target : u32, level : i32, internalformat : i32, width : i32, height : i32, border : i32, format : u32, r#type : u32, pixels : *const core::ffi::c_void));

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexParameterf(target : u32, pname : u32, param2 : f32));

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexParameterfv(target : u32, pname : u32, params : *const f32));

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexParameteri(target : u32, pname : u32, param2 : i32));

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexParameteriv(target : u32, pname : u32, params : *const i32));

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexSubImage1D(target : u32, level : i32, xoffset : i32, width : i32, format : u32, r#type : u32, pixels : *const core::ffi::c_void));

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTexSubImage2D(target : u32, level : i32, xoffset : i32, yoffset : i32, width : i32, height : i32, format : u32, r#type : u32, pixels : *const core::ffi::c_void));

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTranslated(x : f64, y : f64, z : f64));

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glTranslatef(x : f32, y : f32, z : f32));

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2d(x : f64, y : f64));

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2dv(v : *const f64));

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2f(x : f32, y : f32));

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2fv(v : *const f32));

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2i(x : i32, y : i32));

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2iv(v : *const i32));

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2s(x : i16, y : i16));

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex2sv(v : *const i16));

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3d(x : f64, y : f64, z : f64));

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3dv(v : *const f64));

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3f(x : f32, y : f32, z : f32));

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3fv(v : *const f32));

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3i(x : i32, y : i32, z : i32));

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3iv(v : *const i32));

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3s(x : i16, y : i16, z : i16));

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex3sv(v : *const i16));

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4d(x : f64, y : f64, z : f64, w : f64));

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4dv(v : *const f64));

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4f(x : f32, y : f32, z : f32, w : f32));

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4fv(v : *const f32));

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4i(x : i32, y : i32, z : i32, w : i32));

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4iv(v : *const i32));

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4s(x : i16, y : i16, z : i16, w : i16));

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertex4sv(v : *const i16));

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glVertexPointer(size : i32, r#type : u32, stride : i32, pointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn glViewport(x : i32, y : i32, width : i32, height : i32));

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluBeginCurve(nobj : *mut GLUnurbs));

// UNSUPPORTED Rust 350:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluBeginPolygon(tess : *mut GLUtesselator));

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluBeginSurface(nobj : *mut GLUnurbs));

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluBeginTrim(nobj : *mut GLUnurbs));

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluBuild1DMipmaps(target : u32, components : i32, width : i32, format : u32, r#type : u32, data : *const core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluBuild2DMipmaps(target : u32, components : i32, width : i32, height : i32, format : u32, r#type : u32, data : *const core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluCylinder(qobj : *mut GLUquadric, baseradius : f64, topradius : f64, height : f64, slices : i32, stacks : i32));

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluDeleteNurbsRenderer(nobj : *mut GLUnurbs));

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluDeleteQuadric(state : *mut GLUquadric));

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluDeleteTess(tess : *mut GLUtesselator));

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluDisk(qobj : *mut GLUquadric, innerradius : f64, outerradius : f64, slices : i32, loops : i32));

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluEndCurve(nobj : *mut GLUnurbs));

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluEndPolygon(tess : *mut GLUtesselator));

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluEndSurface(nobj : *mut GLUnurbs));

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluEndTrim(nobj : *mut GLUnurbs));

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluErrorString(errcode : u32) -> *mut u8);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluErrorUnicodeStringEXT(errcode : u32) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluGetNurbsProperty(nobj : *mut GLUnurbs, property : u32, value : *mut f32));

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluGetString(name : u32) -> *mut u8);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluGetTessProperty(tess : *mut GLUtesselator, which : u32, value : *mut f64));

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluLoadSamplingMatrices(nobj : *mut GLUnurbs, modelmatrix : *const f32, projmatrix : *const f32, viewport : *const i32));

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluLookAt(eyex : f64, eyey : f64, eyez : f64, centerx : f64, centery : f64, centerz : f64, upx : f64, upy : f64, upz : f64));

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNewNurbsRenderer() -> *mut GLUnurbs);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNewQuadric() -> *mut GLUquadric);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNewTess() -> *mut GLUtesselator);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNextContour(tess : *mut GLUtesselator, r#type : u32));

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNurbsCallback(nobj : *mut GLUnurbs, which : u32, r#fn : isize));

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNurbsCurve(nobj : *mut GLUnurbs, nknots : i32, knot : *mut f32, stride : i32, ctlarray : *mut f32, order : i32, r#type : u32));

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNurbsProperty(nobj : *mut GLUnurbs, property : u32, value : f32));

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluNurbsSurface(nobj : *mut GLUnurbs, sknot_count : i32, sknot : *mut f32, tknot_count : i32, tknot : *mut f32, s_stride : i32, t_stride : i32, ctlarray : *mut f32, sorder : i32, torder : i32, r#type : u32));

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluOrtho2D(left : f64, right : f64, bottom : f64, top : f64));

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluPartialDisk(qobj : *mut GLUquadric, innerradius : f64, outerradius : f64, slices : i32, loops : i32, startangle : f64, sweepangle : f64));

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluPerspective(fovy : f64, aspect : f64, znear : f64, zfar : f64));

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluPickMatrix(x : f64, y : f64, width : f64, height : f64, viewport : *mut i32));

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluProject(objx : f64, objy : f64, objz : f64, modelmatrix : *const f64, projmatrix : *const f64, viewport : *const i32, winx : *mut f64, winy : *mut f64, winz : *mut f64) -> i32);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluPwlCurve(nobj : *mut GLUnurbs, count : i32, array : *mut f32, stride : i32, r#type : u32));

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluQuadricCallback(qobj : *mut GLUquadric, which : u32, r#fn : isize));

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluQuadricDrawStyle(quadobject : *mut GLUquadric, drawstyle : u32));

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluQuadricNormals(quadobject : *mut GLUquadric, normals : u32));

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluQuadricOrientation(quadobject : *mut GLUquadric, orientation : u32));

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluQuadricTexture(quadobject : *mut GLUquadric, texturecoords : u8));

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluScaleImage(format : u32, widthin : i32, heightin : i32, typein : u32, datain : *const core::ffi::c_void, widthout : i32, heightout : i32, typeout : u32, dataout : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluSphere(qobj : *mut GLUquadric, radius : f64, slices : i32, stacks : i32));

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessBeginContour(tess : *mut GLUtesselator));

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessBeginPolygon(tess : *mut GLUtesselator, polygon_data : *mut core::ffi::c_void));

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessCallback(tess : *mut GLUtesselator, which : u32, r#fn : isize));

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessEndContour(tess : *mut GLUtesselator));

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessEndPolygon(tess : *mut GLUtesselator));

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessNormal(tess : *mut GLUtesselator, x : f64, y : f64, z : f64));

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessProperty(tess : *mut GLUtesselator, which : u32, value : f64));

// UNSUPPORTED Rust 399:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluTessVertex(tess : *mut GLUtesselator, coords : *mut f64, data : *mut core::ffi::c_void));

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("glu32.dll" "system" fn gluUnProject(winx : f64, winy : f64, winz : f64, modelmatrix : *const f64, projmatrix : *const f64, viewport : *const i32, objx : *mut f64, objy : *mut f64, objz : *mut f64) -> i32);

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn wglCopyContext(param0 : HGLRC, param1 : HGLRC, param2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 402:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglCreateContext(param0 : super::Gdi:: HDC) -> HGLRC);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglCreateLayerContext(param0 : super::Gdi:: HDC, param1 : i32) -> HGLRC);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn wglDeleteContext(param0 : HGLRC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglDescribeLayerPlane(param0 : super::Gdi:: HDC, param1 : i32, param2 : i32, param3 : u32, param4 : *mut LAYERPLANEDESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn wglGetCurrentContext() -> HGLRC);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglGetCurrentDC() -> super::Gdi:: HDC);

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglGetLayerPaletteEntries(param0 : super::Gdi:: HDC, param1 : i32, param2 : i32, param3 : i32, param4 : *mut super::super::Foundation:: COLORREF) -> i32);

// UNSUPPORTED Rust 414:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn wglGetProcAddress(param0 : windows_sys::core::PCSTR) -> super::super::Foundation:: PROC);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglMakeCurrent(param0 : super::Gdi:: HDC, param1 : HGLRC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglRealizeLayerPalette(param0 : super::Gdi:: HDC, param1 : i32, param2 : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglSetLayerPaletteEntries(param0 : super::Gdi:: HDC, param1 : i32, param2 : i32, param3 : i32, param4 : *const super::super::Foundation:: COLORREF) -> i32);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn wglShareLists(param0 : HGLRC, param1 : HGLRC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 422:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglSwapLayerBuffers(param0 : super::Gdi:: HDC, param1 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglUseFontBitmapsA(param0 : super::Gdi:: HDC, param1 : u32, param2 : u32, param3 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglUseFontBitmapsW(param0 : super::Gdi:: HDC, param1 : u32, param2 : u32, param3 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglUseFontOutlinesA(param0 : super::Gdi:: HDC, param1 : u32, param2 : u32, param3 : u32, param4 : f32, param5 : f32, param6 : i32, param7 : *mut GLYPHMETRICSFLOAT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("opengl32.dll" "system" fn wglUseFontOutlinesW(param0 : super::Gdi:: HDC, param1 : u32, param2 : u32, param3 : u32, param4 : f32, param5 : f32, param6 : i32, param7 : *mut GLYPHMETRICSFLOAT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct EMRPIXELFORMAT {
//     pub emr: super::Gdi::EMR,
//     pub pfd: PIXELFORMATDESCRIPTOR,
// }

public const val `GLU_AUTO_LOAD_MATRIX`: UInt = 100200u;
public const val `GLU_BEGIN`: UInt = 100100u;
public const val `GLU_CCW`: UInt = 100121u;
public const val `GLU_CULLING`: UInt = 100201u;
public const val `GLU_CW`: UInt = 100120u;
public const val `GLU_DISPLAY_MODE`: UInt = 100204u;
public const val `GLU_DOMAIN_DISTANCE`: UInt = 100217u;
public const val `GLU_EDGE_FLAG`: UInt = 100104u;
public const val `GLU_END`: UInt = 100102u;
public const val `GLU_ERROR`: UInt = 100103u;
public const val `GLU_EXTENSIONS`: UInt = 100801u;
public const val `GLU_EXTERIOR`: UInt = 100123u;
public const val `GLU_FALSE`: UInt = 0u;
public const val `GLU_FILL`: UInt = 100012u;
public const val `GLU_FLAT`: UInt = 100001u;
public const val `GLU_INCOMPATIBLE_GL_VERSION`: UInt = 100903u;
public const val `GLU_INSIDE`: UInt = 100021u;
public const val `GLU_INTERIOR`: UInt = 100122u;
public const val `GLU_INVALID_ENUM`: UInt = 100900u;
public const val `GLU_INVALID_VALUE`: UInt = 100901u;
public const val `GLU_LINE`: UInt = 100011u;
public const val `GLU_MAP1_TRIM_2`: UInt = 100210u;
public const val `GLU_MAP1_TRIM_3`: UInt = 100211u;
public const val `GLU_NONE`: UInt = 100002u;
public const val `GLU_NURBS_ERROR1`: UInt = 100251u;
public const val `GLU_NURBS_ERROR10`: UInt = 100260u;
public const val `GLU_NURBS_ERROR11`: UInt = 100261u;
public const val `GLU_NURBS_ERROR12`: UInt = 100262u;
public const val `GLU_NURBS_ERROR13`: UInt = 100263u;
public const val `GLU_NURBS_ERROR14`: UInt = 100264u;
public const val `GLU_NURBS_ERROR15`: UInt = 100265u;
public const val `GLU_NURBS_ERROR16`: UInt = 100266u;
public const val `GLU_NURBS_ERROR17`: UInt = 100267u;
public const val `GLU_NURBS_ERROR18`: UInt = 100268u;
public const val `GLU_NURBS_ERROR19`: UInt = 100269u;
public const val `GLU_NURBS_ERROR2`: UInt = 100252u;
public const val `GLU_NURBS_ERROR20`: UInt = 100270u;
public const val `GLU_NURBS_ERROR21`: UInt = 100271u;
public const val `GLU_NURBS_ERROR22`: UInt = 100272u;
public const val `GLU_NURBS_ERROR23`: UInt = 100273u;
public const val `GLU_NURBS_ERROR24`: UInt = 100274u;
public const val `GLU_NURBS_ERROR25`: UInt = 100275u;
public const val `GLU_NURBS_ERROR26`: UInt = 100276u;
public const val `GLU_NURBS_ERROR27`: UInt = 100277u;
public const val `GLU_NURBS_ERROR28`: UInt = 100278u;
public const val `GLU_NURBS_ERROR29`: UInt = 100279u;
public const val `GLU_NURBS_ERROR3`: UInt = 100253u;
public const val `GLU_NURBS_ERROR30`: UInt = 100280u;
public const val `GLU_NURBS_ERROR31`: UInt = 100281u;
public const val `GLU_NURBS_ERROR32`: UInt = 100282u;
public const val `GLU_NURBS_ERROR33`: UInt = 100283u;
public const val `GLU_NURBS_ERROR34`: UInt = 100284u;
public const val `GLU_NURBS_ERROR35`: UInt = 100285u;
public const val `GLU_NURBS_ERROR36`: UInt = 100286u;
public const val `GLU_NURBS_ERROR37`: UInt = 100287u;
public const val `GLU_NURBS_ERROR4`: UInt = 100254u;
public const val `GLU_NURBS_ERROR5`: UInt = 100255u;
public const val `GLU_NURBS_ERROR6`: UInt = 100256u;
public const val `GLU_NURBS_ERROR7`: UInt = 100257u;
public const val `GLU_NURBS_ERROR8`: UInt = 100258u;
public const val `GLU_NURBS_ERROR9`: UInt = 100259u;
public const val `GLU_OUTLINE_PATCH`: UInt = 100241u;
public const val `GLU_OUTLINE_POLYGON`: UInt = 100240u;
public const val `GLU_OUTSIDE`: UInt = 100020u;
public const val `GLU_OUT_OF_MEMORY`: UInt = 100902u;
public const val `GLU_PARAMETRIC_ERROR`: UInt = 100216u;
public const val `GLU_PARAMETRIC_TOLERANCE`: UInt = 100202u;
public const val `GLU_PATH_LENGTH`: UInt = 100215u;
public const val `GLU_POINT`: UInt = 100010u;
public const val `GLU_SAMPLING_METHOD`: UInt = 100205u;
public const val `GLU_SAMPLING_TOLERANCE`: UInt = 100203u;
public const val `GLU_SILHOUETTE`: UInt = 100013u;
public const val `GLU_SMOOTH`: UInt = 100000u;
public const val `GLU_TESS_BEGIN`: UInt = 100100u;
public const val `GLU_TESS_BEGIN_DATA`: UInt = 100106u;
public const val `GLU_TESS_BOUNDARY_ONLY`: UInt = 100141u;
public const val `GLU_TESS_COMBINE`: UInt = 100105u;
public const val `GLU_TESS_COMBINE_DATA`: UInt = 100111u;
public const val `GLU_TESS_COORD_TOO_LARGE`: UInt = 100155u;
public const val `GLU_TESS_EDGE_FLAG`: UInt = 100104u;
public const val `GLU_TESS_EDGE_FLAG_DATA`: UInt = 100110u;
public const val `GLU_TESS_END`: UInt = 100102u;
public const val `GLU_TESS_END_DATA`: UInt = 100108u;
public const val `GLU_TESS_ERROR`: UInt = 100103u;
public const val `GLU_TESS_ERROR1`: UInt = 100151u;
public const val `GLU_TESS_ERROR2`: UInt = 100152u;
public const val `GLU_TESS_ERROR3`: UInt = 100153u;
public const val `GLU_TESS_ERROR4`: UInt = 100154u;
public const val `GLU_TESS_ERROR5`: UInt = 100155u;
public const val `GLU_TESS_ERROR6`: UInt = 100156u;
public const val `GLU_TESS_ERROR7`: UInt = 100157u;
public const val `GLU_TESS_ERROR8`: UInt = 100158u;
public const val `GLU_TESS_ERROR_DATA`: UInt = 100109u;
public const val `GLU_TESS_MISSING_BEGIN_CONTOUR`: UInt = 100152u;
public const val `GLU_TESS_MISSING_BEGIN_POLYGON`: UInt = 100151u;
public const val `GLU_TESS_MISSING_END_CONTOUR`: UInt = 100154u;
public const val `GLU_TESS_MISSING_END_POLYGON`: UInt = 100153u;
public const val `GLU_TESS_NEED_COMBINE_CALLBACK`: UInt = 100156u;
public const val `GLU_TESS_TOLERANCE`: UInt = 100142u;
public const val `GLU_TESS_VERTEX`: UInt = 100101u;
public const val `GLU_TESS_VERTEX_DATA`: UInt = 100107u;
public const val `GLU_TESS_WINDING_ABS_GEQ_TWO`: UInt = 100134u;
public const val `GLU_TESS_WINDING_NEGATIVE`: UInt = 100133u;
public const val `GLU_TESS_WINDING_NONZERO`: UInt = 100131u;
public const val `GLU_TESS_WINDING_ODD`: UInt = 100130u;
public const val `GLU_TESS_WINDING_POSITIVE`: UInt = 100132u;
public const val `GLU_TESS_WINDING_RULE`: UInt = 100140u;
public const val `GLU_TRUE`: UInt = 1u;
public const val `GLU_UNKNOWN`: UInt = 100124u;
public const val `GLU_U_STEP`: UInt = 100206u;
public const val `GLU_VERSION`: UInt = 100800u;
public const val `GLU_VERSION_1_1`: UInt = 1u;
public const val `GLU_VERSION_1_2`: UInt = 1u;
public const val `GLU_VERTEX`: UInt = 100101u;
public const val `GLU_V_STEP`: UInt = 100207u;
public typealias `GLUnurbs` = Long;
// UNSUPPORTED Rust 555:1: generic scalar type unsupported
// pub type GLUnurbsErrorProc = Option<unsafe extern "system" fn(param0: u32)>;

public typealias `GLUquadric` = Long;
// UNSUPPORTED Rust 557:1: generic scalar type unsupported
// pub type GLUquadricErrorProc = Option<unsafe extern "system" fn(param0: u32)>;

// UNSUPPORTED Rust 558:1: generic scalar type unsupported
// pub type GLUtessBeginDataProc = Option<unsafe extern "system" fn(param0: u32, param1: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 559:1: generic scalar type unsupported
// pub type GLUtessBeginProc = Option<unsafe extern "system" fn(param0: u32)>;

// UNSUPPORTED Rust 560:1: generic scalar type unsupported
// pub type GLUtessCombineDataProc = Option<unsafe extern "system" fn(param0: *mut f64, param1: *mut *mut core::ffi::c_void, param2: *mut f32, param3: *mut *mut core::ffi::c_void, param4: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 561:1: generic scalar type unsupported
// pub type GLUtessCombineProc = Option<unsafe extern "system" fn(param0: *mut f64, param1: *mut *mut core::ffi::c_void, param2: *mut f32, param3: *mut *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 562:1: generic scalar type unsupported
// pub type GLUtessEdgeFlagDataProc = Option<unsafe extern "system" fn(param0: u8, param1: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 563:1: generic scalar type unsupported
// pub type GLUtessEdgeFlagProc = Option<unsafe extern "system" fn(param0: u8)>;

// UNSUPPORTED Rust 564:1: generic scalar type unsupported
// pub type GLUtessEndDataProc = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 565:1: generic scalar type unsupported
// pub type GLUtessEndProc = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 566:1: generic scalar type unsupported
// pub type GLUtessErrorDataProc = Option<unsafe extern "system" fn(param0: u32, param1: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 567:1: generic scalar type unsupported
// pub type GLUtessErrorProc = Option<unsafe extern "system" fn(param0: u32)>;

// UNSUPPORTED Rust 568:1: generic scalar type unsupported
// pub type GLUtessVertexDataProc = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 569:1: generic scalar type unsupported
// pub type GLUtessVertexProc = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void)>;

public typealias `GLUtesselator` = Long;
// UNSUPPORTED Rust 571:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GLYPHMETRICSFLOAT {
//     pub gmfBlackBoxX: f32,
//     pub gmfBlackBoxY: f32,
//     pub gmfptGlyphOrigin: POINTFLOAT,
//     pub gmfCellIncX: f32,
//     pub gmfCellIncY: f32,
// }

public const val `GL_2D`: UInt = 1536u;
public const val `GL_2_BYTES`: UInt = 5127u;
public const val `GL_3D`: UInt = 1537u;
public const val `GL_3D_COLOR`: UInt = 1538u;
public const val `GL_3D_COLOR_TEXTURE`: UInt = 1539u;
public const val `GL_3_BYTES`: UInt = 5128u;
public const val `GL_4D_COLOR_TEXTURE`: UInt = 1540u;
public const val `GL_4_BYTES`: UInt = 5129u;
public const val `GL_ACCUM`: UInt = 256u;
public const val `GL_ACCUM_ALPHA_BITS`: UInt = 3419u;
public const val `GL_ACCUM_BLUE_BITS`: UInt = 3418u;
public const val `GL_ACCUM_BUFFER_BIT`: UInt = 512u;
public const val `GL_ACCUM_CLEAR_VALUE`: UInt = 2944u;
public const val `GL_ACCUM_GREEN_BITS`: UInt = 3417u;
public const val `GL_ACCUM_RED_BITS`: UInt = 3416u;
public const val `GL_ADD`: UInt = 260u;
public const val `GL_ALL_ATTRIB_BITS`: UInt = 1048575u;
public const val `GL_ALPHA`: UInt = 6406u;
public const val `GL_ALPHA12`: UInt = 32829u;
public const val `GL_ALPHA16`: UInt = 32830u;
public const val `GL_ALPHA4`: UInt = 32827u;
public const val `GL_ALPHA8`: UInt = 32828u;
public const val `GL_ALPHA_BIAS`: UInt = 3357u;
public const val `GL_ALPHA_BITS`: UInt = 3413u;
public const val `GL_ALPHA_SCALE`: UInt = 3356u;
public const val `GL_ALPHA_TEST`: UInt = 3008u;
public const val `GL_ALPHA_TEST_FUNC`: UInt = 3009u;
public const val `GL_ALPHA_TEST_REF`: UInt = 3010u;
public const val `GL_ALWAYS`: UInt = 519u;
public const val `GL_AMBIENT`: UInt = 4608u;
public const val `GL_AMBIENT_AND_DIFFUSE`: UInt = 5634u;
public const val `GL_AND`: UInt = 5377u;
public const val `GL_AND_INVERTED`: UInt = 5380u;
public const val `GL_AND_REVERSE`: UInt = 5378u;
public const val `GL_ATTRIB_STACK_DEPTH`: UInt = 2992u;
public const val `GL_AUTO_NORMAL`: UInt = 3456u;
public const val `GL_AUX0`: UInt = 1033u;
public const val `GL_AUX1`: UInt = 1034u;
public const val `GL_AUX2`: UInt = 1035u;
public const val `GL_AUX3`: UInt = 1036u;
public const val `GL_AUX_BUFFERS`: UInt = 3072u;
public const val `GL_BACK`: UInt = 1029u;
public const val `GL_BACK_LEFT`: UInt = 1026u;
public const val `GL_BACK_RIGHT`: UInt = 1027u;
public const val `GL_BGRA_EXT`: UInt = 32993u;
public const val `GL_BGR_EXT`: UInt = 32992u;
public const val `GL_BITMAP`: UInt = 6656u;
public const val `GL_BITMAP_TOKEN`: UInt = 1796u;
public const val `GL_BLEND`: UInt = 3042u;
public const val `GL_BLEND_DST`: UInt = 3040u;
public const val `GL_BLEND_SRC`: UInt = 3041u;
public const val `GL_BLUE`: UInt = 6405u;
public const val `GL_BLUE_BIAS`: UInt = 3355u;
public const val `GL_BLUE_BITS`: UInt = 3412u;
public const val `GL_BLUE_SCALE`: UInt = 3354u;
public const val `GL_BYTE`: UInt = 5120u;
public const val `GL_C3F_V3F`: UInt = 10788u;
public const val `GL_C4F_N3F_V3F`: UInt = 10790u;
public const val `GL_C4UB_V2F`: UInt = 10786u;
public const val `GL_C4UB_V3F`: UInt = 10787u;
public const val `GL_CCW`: UInt = 2305u;
public const val `GL_CLAMP`: UInt = 10496u;
public const val `GL_CLEAR`: UInt = 5376u;
public const val `GL_CLIENT_ALL_ATTRIB_BITS`: UInt = 4294967295u;
public const val `GL_CLIENT_ATTRIB_STACK_DEPTH`: UInt = 2993u;
public const val `GL_CLIENT_PIXEL_STORE_BIT`: UInt = 1u;
public const val `GL_CLIENT_VERTEX_ARRAY_BIT`: UInt = 2u;
public const val `GL_CLIP_PLANE0`: UInt = 12288u;
public const val `GL_CLIP_PLANE1`: UInt = 12289u;
public const val `GL_CLIP_PLANE2`: UInt = 12290u;
public const val `GL_CLIP_PLANE3`: UInt = 12291u;
public const val `GL_CLIP_PLANE4`: UInt = 12292u;
public const val `GL_CLIP_PLANE5`: UInt = 12293u;
public const val `GL_COEFF`: UInt = 2560u;
public const val `GL_COLOR`: UInt = 6144u;
public const val `GL_COLOR_ARRAY`: UInt = 32886u;
public const val `GL_COLOR_ARRAY_COUNT_EXT`: UInt = 32900u;
public const val `GL_COLOR_ARRAY_EXT`: UInt = 32886u;
public const val `GL_COLOR_ARRAY_POINTER`: UInt = 32912u;
public const val `GL_COLOR_ARRAY_POINTER_EXT`: UInt = 32912u;
public const val `GL_COLOR_ARRAY_SIZE`: UInt = 32897u;
public const val `GL_COLOR_ARRAY_SIZE_EXT`: UInt = 32897u;
public const val `GL_COLOR_ARRAY_STRIDE`: UInt = 32899u;
public const val `GL_COLOR_ARRAY_STRIDE_EXT`: UInt = 32899u;
public const val `GL_COLOR_ARRAY_TYPE`: UInt = 32898u;
public const val `GL_COLOR_ARRAY_TYPE_EXT`: UInt = 32898u;
public const val `GL_COLOR_BUFFER_BIT`: UInt = 16384u;
public const val `GL_COLOR_CLEAR_VALUE`: UInt = 3106u;
public const val `GL_COLOR_INDEX`: UInt = 6400u;
public const val `GL_COLOR_INDEX12_EXT`: UInt = 32998u;
public const val `GL_COLOR_INDEX16_EXT`: UInt = 32999u;
public const val `GL_COLOR_INDEX1_EXT`: UInt = 32994u;
public const val `GL_COLOR_INDEX2_EXT`: UInt = 32995u;
public const val `GL_COLOR_INDEX4_EXT`: UInt = 32996u;
public const val `GL_COLOR_INDEX8_EXT`: UInt = 32997u;
public const val `GL_COLOR_INDEXES`: UInt = 5635u;
public const val `GL_COLOR_LOGIC_OP`: UInt = 3058u;
public const val `GL_COLOR_MATERIAL`: UInt = 2903u;
public const val `GL_COLOR_MATERIAL_FACE`: UInt = 2901u;
public const val `GL_COLOR_MATERIAL_PARAMETER`: UInt = 2902u;
public const val `GL_COLOR_TABLE_ALPHA_SIZE_EXT`: UInt = 32989u;
public const val `GL_COLOR_TABLE_BLUE_SIZE_EXT`: UInt = 32988u;
public const val `GL_COLOR_TABLE_FORMAT_EXT`: UInt = 32984u;
public const val `GL_COLOR_TABLE_GREEN_SIZE_EXT`: UInt = 32987u;
public const val `GL_COLOR_TABLE_INTENSITY_SIZE_EXT`: UInt = 32991u;
public const val `GL_COLOR_TABLE_LUMINANCE_SIZE_EXT`: UInt = 32990u;
public const val `GL_COLOR_TABLE_RED_SIZE_EXT`: UInt = 32986u;
public const val `GL_COLOR_TABLE_WIDTH_EXT`: UInt = 32985u;
public const val `GL_COLOR_WRITEMASK`: UInt = 3107u;
public const val `GL_COMPILE`: UInt = 4864u;
public const val `GL_COMPILE_AND_EXECUTE`: UInt = 4865u;
public const val `GL_CONSTANT_ATTENUATION`: UInt = 4615u;
public const val `GL_COPY`: UInt = 5379u;
public const val `GL_COPY_INVERTED`: UInt = 5388u;
public const val `GL_COPY_PIXEL_TOKEN`: UInt = 1798u;
public const val `GL_CULL_FACE`: UInt = 2884u;
public const val `GL_CULL_FACE_MODE`: UInt = 2885u;
public const val `GL_CURRENT_BIT`: UInt = 1u;
public const val `GL_CURRENT_COLOR`: UInt = 2816u;
public const val `GL_CURRENT_INDEX`: UInt = 2817u;
public const val `GL_CURRENT_NORMAL`: UInt = 2818u;
public const val `GL_CURRENT_RASTER_COLOR`: UInt = 2820u;
public const val `GL_CURRENT_RASTER_DISTANCE`: UInt = 2825u;
public const val `GL_CURRENT_RASTER_INDEX`: UInt = 2821u;
public const val `GL_CURRENT_RASTER_POSITION`: UInt = 2823u;
public const val `GL_CURRENT_RASTER_POSITION_VALID`: UInt = 2824u;
public const val `GL_CURRENT_RASTER_TEXTURE_COORDS`: UInt = 2822u;
public const val `GL_CURRENT_TEXTURE_COORDS`: UInt = 2819u;
public const val `GL_CW`: UInt = 2304u;
public const val `GL_DECAL`: UInt = 8449u;
public const val `GL_DECR`: UInt = 7683u;
public const val `GL_DEPTH`: UInt = 6145u;
public const val `GL_DEPTH_BIAS`: UInt = 3359u;
public const val `GL_DEPTH_BITS`: UInt = 3414u;
public const val `GL_DEPTH_BUFFER_BIT`: UInt = 256u;
public const val `GL_DEPTH_CLEAR_VALUE`: UInt = 2931u;
public const val `GL_DEPTH_COMPONENT`: UInt = 6402u;
public const val `GL_DEPTH_FUNC`: UInt = 2932u;
public const val `GL_DEPTH_RANGE`: UInt = 2928u;
public const val `GL_DEPTH_SCALE`: UInt = 3358u;
public const val `GL_DEPTH_TEST`: UInt = 2929u;
public const val `GL_DEPTH_WRITEMASK`: UInt = 2930u;
public const val `GL_DIFFUSE`: UInt = 4609u;
public const val `GL_DITHER`: UInt = 3024u;
public const val `GL_DOMAIN`: UInt = 2562u;
public const val `GL_DONT_CARE`: UInt = 4352u;
public const val `GL_DOUBLE`: UInt = 5130u;
public const val `GL_DOUBLEBUFFER`: UInt = 3122u;
public const val `GL_DOUBLE_EXT`: UInt = 5130u;
public const val `GL_DRAW_BUFFER`: UInt = 3073u;
public const val `GL_DRAW_PIXEL_TOKEN`: UInt = 1797u;
public const val `GL_DST_ALPHA`: UInt = 772u;
public const val `GL_DST_COLOR`: UInt = 774u;
public const val `GL_EDGE_FLAG`: UInt = 2883u;
public const val `GL_EDGE_FLAG_ARRAY`: UInt = 32889u;
public const val `GL_EDGE_FLAG_ARRAY_COUNT_EXT`: UInt = 32909u;
public const val `GL_EDGE_FLAG_ARRAY_EXT`: UInt = 32889u;
public const val `GL_EDGE_FLAG_ARRAY_POINTER`: UInt = 32915u;
public const val `GL_EDGE_FLAG_ARRAY_POINTER_EXT`: UInt = 32915u;
public const val `GL_EDGE_FLAG_ARRAY_STRIDE`: UInt = 32908u;
public const val `GL_EDGE_FLAG_ARRAY_STRIDE_EXT`: UInt = 32908u;
public const val `GL_EMISSION`: UInt = 5632u;
public const val `GL_ENABLE_BIT`: UInt = 8192u;
public const val `GL_EQUAL`: UInt = 514u;
public const val `GL_EQUIV`: UInt = 5385u;
public const val `GL_EVAL_BIT`: UInt = 65536u;
public const val `GL_EXP`: UInt = 2048u;
public const val `GL_EXP2`: UInt = 2049u;
public const val `GL_EXTENSIONS`: UInt = 7939u;
public const val `GL_EXT_bgra`: UInt = 1u;
public const val `GL_EXT_paletted_texture`: UInt = 1u;
public const val `GL_EXT_vertex_array`: UInt = 1u;
public const val `GL_EYE_LINEAR`: UInt = 9216u;
public const val `GL_EYE_PLANE`: UInt = 9474u;
public const val `GL_FALSE`: UInt = 0u;
public const val `GL_FASTEST`: UInt = 4353u;
public const val `GL_FEEDBACK`: UInt = 7169u;
public const val `GL_FEEDBACK_BUFFER_POINTER`: UInt = 3568u;
public const val `GL_FEEDBACK_BUFFER_SIZE`: UInt = 3569u;
public const val `GL_FEEDBACK_BUFFER_TYPE`: UInt = 3570u;
public const val `GL_FILL`: UInt = 6914u;
public const val `GL_FLAT`: UInt = 7424u;
public const val `GL_FLOAT`: UInt = 5126u;
public const val `GL_FOG`: UInt = 2912u;
public const val `GL_FOG_BIT`: UInt = 128u;
public const val `GL_FOG_COLOR`: UInt = 2918u;
public const val `GL_FOG_DENSITY`: UInt = 2914u;
public const val `GL_FOG_END`: UInt = 2916u;
public const val `GL_FOG_HINT`: UInt = 3156u;
public const val `GL_FOG_INDEX`: UInt = 2913u;
public const val `GL_FOG_MODE`: UInt = 2917u;
public const val `GL_FOG_SPECULAR_TEXTURE_WIN`: UInt = 33004u;
public const val `GL_FOG_START`: UInt = 2915u;
public const val `GL_FRONT`: UInt = 1028u;
public const val `GL_FRONT_AND_BACK`: UInt = 1032u;
public const val `GL_FRONT_FACE`: UInt = 2886u;
public const val `GL_FRONT_LEFT`: UInt = 1024u;
public const val `GL_FRONT_RIGHT`: UInt = 1025u;
public const val `GL_GEQUAL`: UInt = 518u;
public const val `GL_GREATER`: UInt = 516u;
public const val `GL_GREEN`: UInt = 6404u;
public const val `GL_GREEN_BIAS`: UInt = 3353u;
public const val `GL_GREEN_BITS`: UInt = 3411u;
public const val `GL_GREEN_SCALE`: UInt = 3352u;
public const val `GL_HINT_BIT`: UInt = 32768u;
public const val `GL_INCR`: UInt = 7682u;
public const val `GL_INDEX_ARRAY`: UInt = 32887u;
public const val `GL_INDEX_ARRAY_COUNT_EXT`: UInt = 32903u;
public const val `GL_INDEX_ARRAY_EXT`: UInt = 32887u;
public const val `GL_INDEX_ARRAY_POINTER`: UInt = 32913u;
public const val `GL_INDEX_ARRAY_POINTER_EXT`: UInt = 32913u;
public const val `GL_INDEX_ARRAY_STRIDE`: UInt = 32902u;
public const val `GL_INDEX_ARRAY_STRIDE_EXT`: UInt = 32902u;
public const val `GL_INDEX_ARRAY_TYPE`: UInt = 32901u;
public const val `GL_INDEX_ARRAY_TYPE_EXT`: UInt = 32901u;
public const val `GL_INDEX_BITS`: UInt = 3409u;
public const val `GL_INDEX_CLEAR_VALUE`: UInt = 3104u;
public const val `GL_INDEX_LOGIC_OP`: UInt = 3057u;
public const val `GL_INDEX_MODE`: UInt = 3120u;
public const val `GL_INDEX_OFFSET`: UInt = 3347u;
public const val `GL_INDEX_SHIFT`: UInt = 3346u;
public const val `GL_INDEX_WRITEMASK`: UInt = 3105u;
public const val `GL_INT`: UInt = 5124u;
public const val `GL_INTENSITY`: UInt = 32841u;
public const val `GL_INTENSITY12`: UInt = 32844u;
public const val `GL_INTENSITY16`: UInt = 32845u;
public const val `GL_INTENSITY4`: UInt = 32842u;
public const val `GL_INTENSITY8`: UInt = 32843u;
public const val `GL_INVALID_ENUM`: UInt = 1280u;
public const val `GL_INVALID_OPERATION`: UInt = 1282u;
public const val `GL_INVALID_VALUE`: UInt = 1281u;
public const val `GL_INVERT`: UInt = 5386u;
public const val `GL_KEEP`: UInt = 7680u;
public const val `GL_LEFT`: UInt = 1030u;
public const val `GL_LEQUAL`: UInt = 515u;
public const val `GL_LESS`: UInt = 513u;
public const val `GL_LIGHT0`: UInt = 16384u;
public const val `GL_LIGHT1`: UInt = 16385u;
public const val `GL_LIGHT2`: UInt = 16386u;
public const val `GL_LIGHT3`: UInt = 16387u;
public const val `GL_LIGHT4`: UInt = 16388u;
public const val `GL_LIGHT5`: UInt = 16389u;
public const val `GL_LIGHT6`: UInt = 16390u;
public const val `GL_LIGHT7`: UInt = 16391u;
public const val `GL_LIGHTING`: UInt = 2896u;
public const val `GL_LIGHTING_BIT`: UInt = 64u;
public const val `GL_LIGHT_MODEL_AMBIENT`: UInt = 2899u;
public const val `GL_LIGHT_MODEL_LOCAL_VIEWER`: UInt = 2897u;
public const val `GL_LIGHT_MODEL_TWO_SIDE`: UInt = 2898u;
public const val `GL_LINE`: UInt = 6913u;
public const val `GL_LINEAR`: UInt = 9729u;
public const val `GL_LINEAR_ATTENUATION`: UInt = 4616u;
public const val `GL_LINEAR_MIPMAP_LINEAR`: UInt = 9987u;
public const val `GL_LINEAR_MIPMAP_NEAREST`: UInt = 9985u;
public const val `GL_LINES`: UInt = 1u;
public const val `GL_LINE_BIT`: UInt = 4u;
public const val `GL_LINE_LOOP`: UInt = 2u;
public const val `GL_LINE_RESET_TOKEN`: UInt = 1799u;
public const val `GL_LINE_SMOOTH`: UInt = 2848u;
public const val `GL_LINE_SMOOTH_HINT`: UInt = 3154u;
public const val `GL_LINE_STIPPLE`: UInt = 2852u;
public const val `GL_LINE_STIPPLE_PATTERN`: UInt = 2853u;
public const val `GL_LINE_STIPPLE_REPEAT`: UInt = 2854u;
public const val `GL_LINE_STRIP`: UInt = 3u;
public const val `GL_LINE_TOKEN`: UInt = 1794u;
public const val `GL_LINE_WIDTH`: UInt = 2849u;
public const val `GL_LINE_WIDTH_GRANULARITY`: UInt = 2851u;
public const val `GL_LINE_WIDTH_RANGE`: UInt = 2850u;
public const val `GL_LIST_BASE`: UInt = 2866u;
public const val `GL_LIST_BIT`: UInt = 131072u;
public const val `GL_LIST_INDEX`: UInt = 2867u;
public const val `GL_LIST_MODE`: UInt = 2864u;
public const val `GL_LOAD`: UInt = 257u;
public const val `GL_LOGIC_OP`: UInt = 3057u;
public const val `GL_LOGIC_OP_MODE`: UInt = 3056u;
public const val `GL_LUMINANCE`: UInt = 6409u;
public const val `GL_LUMINANCE12`: UInt = 32833u;
public const val `GL_LUMINANCE12_ALPHA12`: UInt = 32839u;
public const val `GL_LUMINANCE12_ALPHA4`: UInt = 32838u;
public const val `GL_LUMINANCE16`: UInt = 32834u;
public const val `GL_LUMINANCE16_ALPHA16`: UInt = 32840u;
public const val `GL_LUMINANCE4`: UInt = 32831u;
public const val `GL_LUMINANCE4_ALPHA4`: UInt = 32835u;
public const val `GL_LUMINANCE6_ALPHA2`: UInt = 32836u;
public const val `GL_LUMINANCE8`: UInt = 32832u;
public const val `GL_LUMINANCE8_ALPHA8`: UInt = 32837u;
public const val `GL_LUMINANCE_ALPHA`: UInt = 6410u;
public const val `GL_MAP1_COLOR_4`: UInt = 3472u;
public const val `GL_MAP1_GRID_DOMAIN`: UInt = 3536u;
public const val `GL_MAP1_GRID_SEGMENTS`: UInt = 3537u;
public const val `GL_MAP1_INDEX`: UInt = 3473u;
public const val `GL_MAP1_NORMAL`: UInt = 3474u;
public const val `GL_MAP1_TEXTURE_COORD_1`: UInt = 3475u;
public const val `GL_MAP1_TEXTURE_COORD_2`: UInt = 3476u;
public const val `GL_MAP1_TEXTURE_COORD_3`: UInt = 3477u;
public const val `GL_MAP1_TEXTURE_COORD_4`: UInt = 3478u;
public const val `GL_MAP1_VERTEX_3`: UInt = 3479u;
public const val `GL_MAP1_VERTEX_4`: UInt = 3480u;
public const val `GL_MAP2_COLOR_4`: UInt = 3504u;
public const val `GL_MAP2_GRID_DOMAIN`: UInt = 3538u;
public const val `GL_MAP2_GRID_SEGMENTS`: UInt = 3539u;
public const val `GL_MAP2_INDEX`: UInt = 3505u;
public const val `GL_MAP2_NORMAL`: UInt = 3506u;
public const val `GL_MAP2_TEXTURE_COORD_1`: UInt = 3507u;
public const val `GL_MAP2_TEXTURE_COORD_2`: UInt = 3508u;
public const val `GL_MAP2_TEXTURE_COORD_3`: UInt = 3509u;
public const val `GL_MAP2_TEXTURE_COORD_4`: UInt = 3510u;
public const val `GL_MAP2_VERTEX_3`: UInt = 3511u;
public const val `GL_MAP2_VERTEX_4`: UInt = 3512u;
public const val `GL_MAP_COLOR`: UInt = 3344u;
public const val `GL_MAP_STENCIL`: UInt = 3345u;
public const val `GL_MATRIX_MODE`: UInt = 2976u;
public const val `GL_MAX_ATTRIB_STACK_DEPTH`: UInt = 3381u;
public const val `GL_MAX_CLIENT_ATTRIB_STACK_DEPTH`: UInt = 3387u;
public const val `GL_MAX_CLIP_PLANES`: UInt = 3378u;
public const val `GL_MAX_ELEMENTS_INDICES_WIN`: UInt = 33001u;
public const val `GL_MAX_ELEMENTS_VERTICES_WIN`: UInt = 33000u;
public const val `GL_MAX_EVAL_ORDER`: UInt = 3376u;
public const val `GL_MAX_LIGHTS`: UInt = 3377u;
public const val `GL_MAX_LIST_NESTING`: UInt = 2865u;
public const val `GL_MAX_MODELVIEW_STACK_DEPTH`: UInt = 3382u;
public const val `GL_MAX_NAME_STACK_DEPTH`: UInt = 3383u;
public const val `GL_MAX_PIXEL_MAP_TABLE`: UInt = 3380u;
public const val `GL_MAX_PROJECTION_STACK_DEPTH`: UInt = 3384u;
public const val `GL_MAX_TEXTURE_SIZE`: UInt = 3379u;
public const val `GL_MAX_TEXTURE_STACK_DEPTH`: UInt = 3385u;
public const val `GL_MAX_VIEWPORT_DIMS`: UInt = 3386u;
public const val `GL_MODELVIEW`: UInt = 5888u;
public const val `GL_MODELVIEW_MATRIX`: UInt = 2982u;
public const val `GL_MODELVIEW_STACK_DEPTH`: UInt = 2979u;
public const val `GL_MODULATE`: UInt = 8448u;
public const val `GL_MULT`: UInt = 259u;
public const val `GL_N3F_V3F`: UInt = 10789u;
public const val `GL_NAME_STACK_DEPTH`: UInt = 3440u;
public const val `GL_NAND`: UInt = 5390u;
public const val `GL_NEAREST`: UInt = 9728u;
public const val `GL_NEAREST_MIPMAP_LINEAR`: UInt = 9986u;
public const val `GL_NEAREST_MIPMAP_NEAREST`: UInt = 9984u;
public const val `GL_NEVER`: UInt = 512u;
public const val `GL_NICEST`: UInt = 4354u;
public const val `GL_NONE`: UInt = 0u;
public const val `GL_NOOP`: UInt = 5381u;
public const val `GL_NOR`: UInt = 5384u;
public const val `GL_NORMALIZE`: UInt = 2977u;
public const val `GL_NORMAL_ARRAY`: UInt = 32885u;
public const val `GL_NORMAL_ARRAY_COUNT_EXT`: UInt = 32896u;
public const val `GL_NORMAL_ARRAY_EXT`: UInt = 32885u;
public const val `GL_NORMAL_ARRAY_POINTER`: UInt = 32911u;
public const val `GL_NORMAL_ARRAY_POINTER_EXT`: UInt = 32911u;
public const val `GL_NORMAL_ARRAY_STRIDE`: UInt = 32895u;
public const val `GL_NORMAL_ARRAY_STRIDE_EXT`: UInt = 32895u;
public const val `GL_NORMAL_ARRAY_TYPE`: UInt = 32894u;
public const val `GL_NORMAL_ARRAY_TYPE_EXT`: UInt = 32894u;
public const val `GL_NOTEQUAL`: UInt = 517u;
public const val `GL_NO_ERROR`: UInt = 0u;
public const val `GL_OBJECT_LINEAR`: UInt = 9217u;
public const val `GL_OBJECT_PLANE`: UInt = 9473u;
public const val `GL_ONE`: UInt = 1u;
public const val `GL_ONE_MINUS_DST_ALPHA`: UInt = 773u;
public const val `GL_ONE_MINUS_DST_COLOR`: UInt = 775u;
public const val `GL_ONE_MINUS_SRC_ALPHA`: UInt = 771u;
public const val `GL_ONE_MINUS_SRC_COLOR`: UInt = 769u;
public const val `GL_OR`: UInt = 5383u;
public const val `GL_ORDER`: UInt = 2561u;
public const val `GL_OR_INVERTED`: UInt = 5389u;
public const val `GL_OR_REVERSE`: UInt = 5387u;
public const val `GL_OUT_OF_MEMORY`: UInt = 1285u;
public const val `GL_PACK_ALIGNMENT`: UInt = 3333u;
public const val `GL_PACK_LSB_FIRST`: UInt = 3329u;
public const val `GL_PACK_ROW_LENGTH`: UInt = 3330u;
public const val `GL_PACK_SKIP_PIXELS`: UInt = 3332u;
public const val `GL_PACK_SKIP_ROWS`: UInt = 3331u;
public const val `GL_PACK_SWAP_BYTES`: UInt = 3328u;
public const val `GL_PASS_THROUGH_TOKEN`: UInt = 1792u;
public const val `GL_PERSPECTIVE_CORRECTION_HINT`: UInt = 3152u;
public const val `GL_PHONG_HINT_WIN`: UInt = 33003u;
public const val `GL_PHONG_WIN`: UInt = 33002u;
public const val `GL_PIXEL_MAP_A_TO_A`: UInt = 3193u;
public const val `GL_PIXEL_MAP_A_TO_A_SIZE`: UInt = 3257u;
public const val `GL_PIXEL_MAP_B_TO_B`: UInt = 3192u;
public const val `GL_PIXEL_MAP_B_TO_B_SIZE`: UInt = 3256u;
public const val `GL_PIXEL_MAP_G_TO_G`: UInt = 3191u;
public const val `GL_PIXEL_MAP_G_TO_G_SIZE`: UInt = 3255u;
public const val `GL_PIXEL_MAP_I_TO_A`: UInt = 3189u;
public const val `GL_PIXEL_MAP_I_TO_A_SIZE`: UInt = 3253u;
public const val `GL_PIXEL_MAP_I_TO_B`: UInt = 3188u;
public const val `GL_PIXEL_MAP_I_TO_B_SIZE`: UInt = 3252u;
public const val `GL_PIXEL_MAP_I_TO_G`: UInt = 3187u;
public const val `GL_PIXEL_MAP_I_TO_G_SIZE`: UInt = 3251u;
public const val `GL_PIXEL_MAP_I_TO_I`: UInt = 3184u;
public const val `GL_PIXEL_MAP_I_TO_I_SIZE`: UInt = 3248u;
public const val `GL_PIXEL_MAP_I_TO_R`: UInt = 3186u;
public const val `GL_PIXEL_MAP_I_TO_R_SIZE`: UInt = 3250u;
public const val `GL_PIXEL_MAP_R_TO_R`: UInt = 3190u;
public const val `GL_PIXEL_MAP_R_TO_R_SIZE`: UInt = 3254u;
public const val `GL_PIXEL_MAP_S_TO_S`: UInt = 3185u;
public const val `GL_PIXEL_MAP_S_TO_S_SIZE`: UInt = 3249u;
public const val `GL_PIXEL_MODE_BIT`: UInt = 32u;
public const val `GL_POINT`: UInt = 6912u;
public const val `GL_POINTS`: UInt = 0u;
public const val `GL_POINT_BIT`: UInt = 2u;
public const val `GL_POINT_SIZE`: UInt = 2833u;
public const val `GL_POINT_SIZE_GRANULARITY`: UInt = 2835u;
public const val `GL_POINT_SIZE_RANGE`: UInt = 2834u;
public const val `GL_POINT_SMOOTH`: UInt = 2832u;
public const val `GL_POINT_SMOOTH_HINT`: UInt = 3153u;
public const val `GL_POINT_TOKEN`: UInt = 1793u;
public const val `GL_POLYGON`: UInt = 9u;
public const val `GL_POLYGON_BIT`: UInt = 8u;
public const val `GL_POLYGON_MODE`: UInt = 2880u;
public const val `GL_POLYGON_OFFSET_FACTOR`: UInt = 32824u;
public const val `GL_POLYGON_OFFSET_FILL`: UInt = 32823u;
public const val `GL_POLYGON_OFFSET_LINE`: UInt = 10754u;
public const val `GL_POLYGON_OFFSET_POINT`: UInt = 10753u;
public const val `GL_POLYGON_OFFSET_UNITS`: UInt = 10752u;
public const val `GL_POLYGON_SMOOTH`: UInt = 2881u;
public const val `GL_POLYGON_SMOOTH_HINT`: UInt = 3155u;
public const val `GL_POLYGON_STIPPLE`: UInt = 2882u;
public const val `GL_POLYGON_STIPPLE_BIT`: UInt = 16u;
public const val `GL_POLYGON_TOKEN`: UInt = 1795u;
public const val `GL_POSITION`: UInt = 4611u;
public const val `GL_PROJECTION`: UInt = 5889u;
public const val `GL_PROJECTION_MATRIX`: UInt = 2983u;
public const val `GL_PROJECTION_STACK_DEPTH`: UInt = 2980u;
public const val `GL_PROXY_TEXTURE_1D`: UInt = 32867u;
public const val `GL_PROXY_TEXTURE_2D`: UInt = 32868u;
public const val `GL_Q`: UInt = 8195u;
public const val `GL_QUADRATIC_ATTENUATION`: UInt = 4617u;
public const val `GL_QUADS`: UInt = 7u;
public const val `GL_QUAD_STRIP`: UInt = 8u;
public const val `GL_R`: UInt = 8194u;
public const val `GL_R3_G3_B2`: UInt = 10768u;
public const val `GL_READ_BUFFER`: UInt = 3074u;
public const val `GL_RED`: UInt = 6403u;
public const val `GL_RED_BIAS`: UInt = 3349u;
public const val `GL_RED_BITS`: UInt = 3410u;
public const val `GL_RED_SCALE`: UInt = 3348u;
public const val `GL_RENDER`: UInt = 7168u;
public const val `GL_RENDERER`: UInt = 7937u;
public const val `GL_RENDER_MODE`: UInt = 3136u;
public const val `GL_REPEAT`: UInt = 10497u;
public const val `GL_REPLACE`: UInt = 7681u;
public const val `GL_RETURN`: UInt = 258u;
public const val `GL_RGB`: UInt = 6407u;
public const val `GL_RGB10`: UInt = 32850u;
public const val `GL_RGB10_A2`: UInt = 32857u;
public const val `GL_RGB12`: UInt = 32851u;
public const val `GL_RGB16`: UInt = 32852u;
public const val `GL_RGB4`: UInt = 32847u;
public const val `GL_RGB5`: UInt = 32848u;
public const val `GL_RGB5_A1`: UInt = 32855u;
public const val `GL_RGB8`: UInt = 32849u;
public const val `GL_RGBA`: UInt = 6408u;
public const val `GL_RGBA12`: UInt = 32858u;
public const val `GL_RGBA16`: UInt = 32859u;
public const val `GL_RGBA2`: UInt = 32853u;
public const val `GL_RGBA4`: UInt = 32854u;
public const val `GL_RGBA8`: UInt = 32856u;
public const val `GL_RGBA_MODE`: UInt = 3121u;
public const val `GL_RIGHT`: UInt = 1031u;
public const val `GL_S`: UInt = 8192u;
public const val `GL_SCISSOR_BIT`: UInt = 524288u;
public const val `GL_SCISSOR_BOX`: UInt = 3088u;
public const val `GL_SCISSOR_TEST`: UInt = 3089u;
public const val `GL_SELECT`: UInt = 7170u;
public const val `GL_SELECTION_BUFFER_POINTER`: UInt = 3571u;
public const val `GL_SELECTION_BUFFER_SIZE`: UInt = 3572u;
public const val `GL_SET`: UInt = 5391u;
public const val `GL_SHADE_MODEL`: UInt = 2900u;
public const val `GL_SHININESS`: UInt = 5633u;
public const val `GL_SHORT`: UInt = 5122u;
public const val `GL_SMOOTH`: UInt = 7425u;
public const val `GL_SPECULAR`: UInt = 4610u;
public const val `GL_SPHERE_MAP`: UInt = 9218u;
public const val `GL_SPOT_CUTOFF`: UInt = 4614u;
public const val `GL_SPOT_DIRECTION`: UInt = 4612u;
public const val `GL_SPOT_EXPONENT`: UInt = 4613u;
public const val `GL_SRC_ALPHA`: UInt = 770u;
public const val `GL_SRC_ALPHA_SATURATE`: UInt = 776u;
public const val `GL_SRC_COLOR`: UInt = 768u;
public const val `GL_STACK_OVERFLOW`: UInt = 1283u;
public const val `GL_STACK_UNDERFLOW`: UInt = 1284u;
public const val `GL_STENCIL`: UInt = 6146u;
public const val `GL_STENCIL_BITS`: UInt = 3415u;
public const val `GL_STENCIL_BUFFER_BIT`: UInt = 1024u;
public const val `GL_STENCIL_CLEAR_VALUE`: UInt = 2961u;
public const val `GL_STENCIL_FAIL`: UInt = 2964u;
public const val `GL_STENCIL_FUNC`: UInt = 2962u;
public const val `GL_STENCIL_INDEX`: UInt = 6401u;
public const val `GL_STENCIL_PASS_DEPTH_FAIL`: UInt = 2965u;
public const val `GL_STENCIL_PASS_DEPTH_PASS`: UInt = 2966u;
public const val `GL_STENCIL_REF`: UInt = 2967u;
public const val `GL_STENCIL_TEST`: UInt = 2960u;
public const val `GL_STENCIL_VALUE_MASK`: UInt = 2963u;
public const val `GL_STENCIL_WRITEMASK`: UInt = 2968u;
public const val `GL_STEREO`: UInt = 3123u;
public const val `GL_SUBPIXEL_BITS`: UInt = 3408u;
public const val `GL_T`: UInt = 8193u;
public const val `GL_T2F_C3F_V3F`: UInt = 10794u;
public const val `GL_T2F_C4F_N3F_V3F`: UInt = 10796u;
public const val `GL_T2F_C4UB_V3F`: UInt = 10793u;
public const val `GL_T2F_N3F_V3F`: UInt = 10795u;
public const val `GL_T2F_V3F`: UInt = 10791u;
public const val `GL_T4F_C4F_N3F_V4F`: UInt = 10797u;
public const val `GL_T4F_V4F`: UInt = 10792u;
public const val `GL_TEXTURE`: UInt = 5890u;
public const val `GL_TEXTURE_1D`: UInt = 3552u;
public const val `GL_TEXTURE_2D`: UInt = 3553u;
public const val `GL_TEXTURE_ALPHA_SIZE`: UInt = 32863u;
public const val `GL_TEXTURE_BINDING_1D`: UInt = 32872u;
public const val `GL_TEXTURE_BINDING_2D`: UInt = 32873u;
public const val `GL_TEXTURE_BIT`: UInt = 262144u;
public const val `GL_TEXTURE_BLUE_SIZE`: UInt = 32862u;
public const val `GL_TEXTURE_BORDER`: UInt = 4101u;
public const val `GL_TEXTURE_BORDER_COLOR`: UInt = 4100u;
public const val `GL_TEXTURE_COMPONENTS`: UInt = 4099u;
public const val `GL_TEXTURE_COORD_ARRAY`: UInt = 32888u;
public const val `GL_TEXTURE_COORD_ARRAY_COUNT_EXT`: UInt = 32907u;
public const val `GL_TEXTURE_COORD_ARRAY_EXT`: UInt = 32888u;
public const val `GL_TEXTURE_COORD_ARRAY_POINTER`: UInt = 32914u;
public const val `GL_TEXTURE_COORD_ARRAY_POINTER_EXT`: UInt = 32914u;
public const val `GL_TEXTURE_COORD_ARRAY_SIZE`: UInt = 32904u;
public const val `GL_TEXTURE_COORD_ARRAY_SIZE_EXT`: UInt = 32904u;
public const val `GL_TEXTURE_COORD_ARRAY_STRIDE`: UInt = 32906u;
public const val `GL_TEXTURE_COORD_ARRAY_STRIDE_EXT`: UInt = 32906u;
public const val `GL_TEXTURE_COORD_ARRAY_TYPE`: UInt = 32905u;
public const val `GL_TEXTURE_COORD_ARRAY_TYPE_EXT`: UInt = 32905u;
public const val `GL_TEXTURE_ENV`: UInt = 8960u;
public const val `GL_TEXTURE_ENV_COLOR`: UInt = 8705u;
public const val `GL_TEXTURE_ENV_MODE`: UInt = 8704u;
public const val `GL_TEXTURE_GEN_MODE`: UInt = 9472u;
public const val `GL_TEXTURE_GEN_Q`: UInt = 3171u;
public const val `GL_TEXTURE_GEN_R`: UInt = 3170u;
public const val `GL_TEXTURE_GEN_S`: UInt = 3168u;
public const val `GL_TEXTURE_GEN_T`: UInt = 3169u;
public const val `GL_TEXTURE_GREEN_SIZE`: UInt = 32861u;
public const val `GL_TEXTURE_HEIGHT`: UInt = 4097u;
public const val `GL_TEXTURE_INTENSITY_SIZE`: UInt = 32865u;
public const val `GL_TEXTURE_INTERNAL_FORMAT`: UInt = 4099u;
public const val `GL_TEXTURE_LUMINANCE_SIZE`: UInt = 32864u;
public const val `GL_TEXTURE_MAG_FILTER`: UInt = 10240u;
public const val `GL_TEXTURE_MATRIX`: UInt = 2984u;
public const val `GL_TEXTURE_MIN_FILTER`: UInt = 10241u;
public const val `GL_TEXTURE_PRIORITY`: UInt = 32870u;
public const val `GL_TEXTURE_RED_SIZE`: UInt = 32860u;
public const val `GL_TEXTURE_RESIDENT`: UInt = 32871u;
public const val `GL_TEXTURE_STACK_DEPTH`: UInt = 2981u;
public const val `GL_TEXTURE_WIDTH`: UInt = 4096u;
public const val `GL_TEXTURE_WRAP_S`: UInt = 10242u;
public const val `GL_TEXTURE_WRAP_T`: UInt = 10243u;
public const val `GL_TRANSFORM_BIT`: UInt = 4096u;
public const val `GL_TRIANGLES`: UInt = 4u;
public const val `GL_TRIANGLE_FAN`: UInt = 6u;
public const val `GL_TRIANGLE_STRIP`: UInt = 5u;
public const val `GL_TRUE`: UInt = 1u;
public const val `GL_UNPACK_ALIGNMENT`: UInt = 3317u;
public const val `GL_UNPACK_LSB_FIRST`: UInt = 3313u;
public const val `GL_UNPACK_ROW_LENGTH`: UInt = 3314u;
public const val `GL_UNPACK_SKIP_PIXELS`: UInt = 3316u;
public const val `GL_UNPACK_SKIP_ROWS`: UInt = 3315u;
public const val `GL_UNPACK_SWAP_BYTES`: UInt = 3312u;
public const val `GL_UNSIGNED_BYTE`: UInt = 5121u;
public const val `GL_UNSIGNED_INT`: UInt = 5125u;
public const val `GL_UNSIGNED_SHORT`: UInt = 5123u;
public const val `GL_V2F`: UInt = 10784u;
public const val `GL_V3F`: UInt = 10785u;
public const val `GL_VENDOR`: UInt = 7936u;
public const val `GL_VERSION`: UInt = 7938u;
public const val `GL_VERSION_1_1`: UInt = 1u;
public const val `GL_VERTEX_ARRAY`: UInt = 32884u;
public const val `GL_VERTEX_ARRAY_COUNT_EXT`: UInt = 32893u;
public const val `GL_VERTEX_ARRAY_EXT`: UInt = 32884u;
public const val `GL_VERTEX_ARRAY_POINTER`: UInt = 32910u;
public const val `GL_VERTEX_ARRAY_POINTER_EXT`: UInt = 32910u;
public const val `GL_VERTEX_ARRAY_SIZE`: UInt = 32890u;
public const val `GL_VERTEX_ARRAY_SIZE_EXT`: UInt = 32890u;
public const val `GL_VERTEX_ARRAY_STRIDE`: UInt = 32892u;
public const val `GL_VERTEX_ARRAY_STRIDE_EXT`: UInt = 32892u;
public const val `GL_VERTEX_ARRAY_TYPE`: UInt = 32891u;
public const val `GL_VERTEX_ARRAY_TYPE_EXT`: UInt = 32891u;
public const val `GL_VIEWPORT`: UInt = 2978u;
public const val `GL_VIEWPORT_BIT`: UInt = 2048u;
public const val `GL_WIN_draw_range_elements`: UInt = 1u;
public const val `GL_WIN_swap_hint`: UInt = 1u;
public const val `GL_XOR`: UInt = 5382u;
public const val `GL_ZERO`: UInt = 0u;
public const val `GL_ZOOM_X`: UInt = 3350u;
public const val `GL_ZOOM_Y`: UInt = 3351u;
// UNSUPPORTED Rust 1168:1: non-scalar type Ptr unsupported
// pub type HGLRC = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LAYERPLANEDESCRIPTOR {
//     pub nSize: u16,
//     pub nVersion: u16,
//     pub dwFlags: u32,
//     pub iPixelType: u8,
//     pub cColorBits: u8,
//     pub cRedBits: u8,
//     pub cRedShift: u8,
//     pub cGreenBits: u8,
//     pub cGreenShift: u8,
//     pub cBlueBits: u8,
//     pub cBlueShift: u8,
//     pub cAlphaBits: u8,
//     pub cAlphaShift: u8,
//     pub cAccumBits: u8,
//     pub cAccumRedBits: u8,
//     pub cAccumGreenBits: u8,
//     pub cAccumBlueBits: u8,
//     pub cAccumAlphaBits: u8,
//     pub cDepthBits: u8,
//     pub cStencilBits: u8,
//     pub cAuxBuffers: u8,
//     pub iLayerPlane: u8,
//     pub bReserved: u8,
//     pub crTransparent: super::super::Foundation::COLORREF,
// }

public const val `PFD_DEPTH_DONTCARE`: `PFD_FLAGS` = 536870912u;
public const val `PFD_DIRECT3D_ACCELERATED`: `PFD_FLAGS` = 16384u;
public const val `PFD_DOUBLEBUFFER`: `PFD_FLAGS` = 1u;
public const val `PFD_DOUBLEBUFFER_DONTCARE`: `PFD_FLAGS` = 1073741824u;
public const val `PFD_DRAW_TO_BITMAP`: `PFD_FLAGS` = 8u;
public const val `PFD_DRAW_TO_WINDOW`: `PFD_FLAGS` = 4u;
public typealias `PFD_FLAGS` = UInt;
public const val `PFD_GENERIC_ACCELERATED`: `PFD_FLAGS` = 4096u;
public const val `PFD_GENERIC_FORMAT`: `PFD_FLAGS` = 64u;
public typealias `PFD_LAYER_TYPE` = Byte;
public const val `PFD_MAIN_PLANE`: `PFD_LAYER_TYPE` = 0;
public const val `PFD_NEED_PALETTE`: `PFD_FLAGS` = 128u;
public const val `PFD_NEED_SYSTEM_PALETTE`: `PFD_FLAGS` = 256u;
public const val `PFD_OVERLAY_PLANE`: `PFD_LAYER_TYPE` = 1;
public typealias `PFD_PIXEL_TYPE` = UByte;
public const val `PFD_STEREO`: `PFD_FLAGS` = 2u;
public const val `PFD_STEREO_DONTCARE`: `PFD_FLAGS` = 2147483648u;
public const val `PFD_SUPPORT_COMPOSITION`: `PFD_FLAGS` = 32768u;
public const val `PFD_SUPPORT_DIRECTDRAW`: `PFD_FLAGS` = 8192u;
public const val `PFD_SUPPORT_GDI`: `PFD_FLAGS` = 16u;
public const val `PFD_SUPPORT_OPENGL`: `PFD_FLAGS` = 32u;
public const val `PFD_SWAP_COPY`: `PFD_FLAGS` = 1024u;
public const val `PFD_SWAP_EXCHANGE`: `PFD_FLAGS` = 512u;
public const val `PFD_SWAP_LAYER_BUFFERS`: `PFD_FLAGS` = 2048u;
public const val `PFD_TYPE_COLORINDEX`: `PFD_PIXEL_TYPE` = 1u;
public const val `PFD_TYPE_RGBA`: `PFD_PIXEL_TYPE` = 0u;
public const val `PFD_UNDERLAY_PLANE`: `PFD_LAYER_TYPE` = -1;
// UNSUPPORTED Rust 1224:1: generic scalar type unsupported
// pub type PFNGLADDSWAPHINTRECTWINPROC = Option<unsafe extern "system" fn(x: i32, y: i32, width: i32, height: i32)>;

// UNSUPPORTED Rust 1225:1: generic scalar type unsupported
// pub type PFNGLARRAYELEMENTARRAYEXTPROC = Option<unsafe extern "system" fn(mode: u32, count: i32, pi: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1226:1: generic scalar type unsupported
// pub type PFNGLARRAYELEMENTEXTPROC = Option<unsafe extern "system" fn(i: i32)>;

// UNSUPPORTED Rust 1227:1: generic scalar type unsupported
// pub type PFNGLCOLORPOINTEREXTPROC = Option<unsafe extern "system" fn(size: i32, r#type: u32, stride: i32, count: i32, pointer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1228:1: generic scalar type unsupported
// pub type PFNGLCOLORSUBTABLEEXTPROC = Option<unsafe extern "system" fn(target: u32, start: i32, count: i32, format: u32, r#type: u32, data: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1229:1: generic scalar type unsupported
// pub type PFNGLCOLORTABLEEXTPROC = Option<unsafe extern "system" fn(target: u32, internalformat: u32, width: i32, format: u32, r#type: u32, data: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1230:1: generic scalar type unsupported
// pub type PFNGLDRAWARRAYSEXTPROC = Option<unsafe extern "system" fn(mode: u32, first: i32, count: i32)>;

// UNSUPPORTED Rust 1231:1: generic scalar type unsupported
// pub type PFNGLDRAWRANGEELEMENTSWINPROC = Option<unsafe extern "system" fn(mode: u32, start: u32, end: u32, count: i32, r#type: u32, indices: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1232:1: generic scalar type unsupported
// pub type PFNGLEDGEFLAGPOINTEREXTPROC = Option<unsafe extern "system" fn(stride: i32, count: i32, pointer: *const u8)>;

// UNSUPPORTED Rust 1233:1: generic scalar type unsupported
// pub type PFNGLGETCOLORTABLEEXTPROC = Option<unsafe extern "system" fn(target: u32, format: u32, r#type: u32, data: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1234:1: generic scalar type unsupported
// pub type PFNGLGETCOLORTABLEPARAMETERFVEXTPROC = Option<unsafe extern "system" fn(target: u32, pname: u32, params: *mut f32)>;

// UNSUPPORTED Rust 1235:1: generic scalar type unsupported
// pub type PFNGLGETCOLORTABLEPARAMETERIVEXTPROC = Option<unsafe extern "system" fn(target: u32, pname: u32, params: *mut i32)>;

// UNSUPPORTED Rust 1236:1: generic scalar type unsupported
// pub type PFNGLGETPOINTERVEXTPROC = Option<unsafe extern "system" fn(pname: u32, params: *mut *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1237:1: generic scalar type unsupported
// pub type PFNGLINDEXPOINTEREXTPROC = Option<unsafe extern "system" fn(r#type: u32, stride: i32, count: i32, pointer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1238:1: generic scalar type unsupported
// pub type PFNGLNORMALPOINTEREXTPROC = Option<unsafe extern "system" fn(r#type: u32, stride: i32, count: i32, pointer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1239:1: generic scalar type unsupported
// pub type PFNGLTEXCOORDPOINTEREXTPROC = Option<unsafe extern "system" fn(size: i32, r#type: u32, stride: i32, count: i32, pointer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1240:1: generic scalar type unsupported
// pub type PFNGLVERTEXPOINTEREXTPROC = Option<unsafe extern "system" fn(size: i32, r#type: u32, stride: i32, count: i32, pointer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PIXELFORMATDESCRIPTOR {
//     pub nSize: u16,
//     pub nVersion: u16,
//     pub dwFlags: PFD_FLAGS,
//     pub iPixelType: PFD_PIXEL_TYPE,
//     pub cColorBits: u8,
//     pub cRedBits: u8,
//     pub cRedShift: u8,
//     pub cGreenBits: u8,
//     pub cGreenShift: u8,
//     pub cBlueBits: u8,
//     pub cBlueShift: u8,
//     pub cAlphaBits: u8,
//     pub cAlphaShift: u8,
//     pub cAccumBits: u8,
//     pub cAccumRedBits: u8,
//     pub cAccumGreenBits: u8,
//     pub cAccumBlueBits: u8,
//     pub cAccumAlphaBits: u8,
//     pub cDepthBits: u8,
//     pub cStencilBits: u8,
//     pub cAuxBuffers: u8,
//     pub iLayerType: u8,
//     pub bReserved: u8,
//     pub dwLayerMask: u32,
//     pub dwVisibleMask: u32,
//     pub dwDamageMask: u32,
// }

// UNSUPPORTED Rust 1271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POINTFLOAT {
//     pub x: f32,
//     pub y: f32,
// }

