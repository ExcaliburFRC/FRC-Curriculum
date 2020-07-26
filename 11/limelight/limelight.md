# Limelight
Limelight is a vision camera designed for FRC. It finds vision targets made of reflective tape, and posts a lot of useful data. The [official Limelight docs](https://docs.limelightvision.io/en/latest/) are very descriptive and simple. Most of the data in the official docs won't be reiterated here. 
## Calculating distance with regression
#### Regression
[Regression](https://www.investopedia.com/terms/r/regression.asp) is taking a group of `(x, y)` pairs and finding a polynomial function that maps each `x` as close as possible to the corresponding `y`. Both Excel (Microsoft Office) and Sheets (Google) have regression abilities, so there is no need to learn the complex math involved. The resulting function can be limited by the power of the polynom (`x`<sup>`max`</sup>). A basic polynom (i.e a linear one: `ax + b`) is slightly less acurate, but more complex polynomials (i.e `x`<sup>`6`</sup>`...`) is more affected by measurement "noise".
#### Using regression with vision values
Most of the values posted by the Limelight are dependent on the distance from the target. The optimal Limelight data for this is `ta`, the percentage of the image filled by the target. We can then place the robot at different distances from the target, and record the vision value. Thus, we have a collection of `(ta, distance)` pairs. Then, we can run a regression analysis on the data, and convert the mathematical function to code.
## Other methods to calculate distance 
There are many other ways to calculate distance based on data recieved from the Limelight, but regression is one of the simpler methods. The official Limelight docs present a method based on [trigonometry](https://docs.limelightvision.io/en/latest/cs_estimating_distance.html#using-a-fixed-angle-camera).