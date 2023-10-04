# JavaRayTracer
Welcome to my first little project that I have recently been working on. It's a pretyt basic project that is just a basic ray tracer.
I'll briefly explain how it works here:
1. Starting with a small explanation of how I designed it, I built it from the ground up thinking about it mostly as how an eye looks
   at the computer screen and almost imagined the screen as a window with an arrary of pixels, where said window peers into everythign
   behind the window.
2. So simply the ray tracer starts by creating an eye or a camera in this case, and then setting up an angle and its location in a 3D space.
   This is achieved by mapping a three dimentional point and a vector to the camera object.
3. Then after that it can create the window object, which is a plane in space that has been shifted so that its horizontal and vertical lines
   allign with how the camera is facing. That way assigning pixels of a screen to it is as easy as traversing through a two dimentional array.
4. After that one can create a sphere at any point inside of this three dimentional space.
5. Once the ray tracing begins, a ray is fired at each pixel of the screen, and if said ray hits the sphere, then the pixel that said ray
   was shot through lights up and thus creates the image. The hit detecion is done using a some basic vector geometry and a nifty trick with
   the pythagorean theorem.
6. After that a picture is returned and all is well!

That being said its still not fully complete and there are still some kinks to work out but this was more just a learning experience for me,
learning all about connecting different object oriented classes and connecting them together in order to work toward some graphics related
goal. 

Thanks again, 
Cameron Chen
